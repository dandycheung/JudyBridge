package com.zly.judy.plugin
/**
 * 配置参数
 * Created by Zhuliya on 2018/8/10
 */
class ConfigExtension {

    /**
     * 模块文件的后缀名规则，用于遍历文件时判断并快速过滤不需要解析文件，可以提升构建速度
     * 例如：XXXJudyModule
     */
    String parseFileSuffix = null

    /**
     * 生成中间层接口文件的后缀名,默认值："Bridge"，生成后的中间层接口文件名为："XXXBridge.java"
     */
    String proxyFileSuffix = "Bridge"

    /**
     * 生成中间层接口文件的包路径(默认值：com.zly.judy.interface)
     */
    String packageName = "com.zly.judy.interlayer"

    /**
     * 总是编译java文件(默认值：false 关闭) 该任务相对比较耗时，不推荐开启该配置
     * 该配置主要是为了解决在修改服务类与生成中间层相关改动后，直接build(run或打包)时，
     * compile${XXX}JavaWithJavac 任务为UP-TO-DATE，导致构建失败，提示JudyBridge中间层接口找不到符号的Bug。
     *
     * 建议修改后，先执行generatorJudyBridge一次再build。
     */
    boolean alwaysCompileJava = false

    /**
     * 是否输出debug日志信息，默认：false,不输出
     */
    boolean logDebug

}