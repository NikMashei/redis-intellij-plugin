package dev.mashei.redisplugin.factory

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import dev.mashei.redisplugin.view.RedisToolWindow

class RedisToolWindowFactory : ToolWindowFactory {

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val redisToolWindow = RedisToolWindow(project, toolWindow)
        val cm = toolWindow.contentManager
        val content = cm.factory.createContent(redisToolWindow.content, "", false)
        cm.addContent(content)
    }
}