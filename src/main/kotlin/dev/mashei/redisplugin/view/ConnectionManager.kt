package dev.mashei.redisplugin.view

import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.actionSystem.ActionToolbar
import com.intellij.openapi.actionSystem.DefaultActionGroup
import com.intellij.openapi.components.Service
import dev.mashei.redisplugin.action.AddConnectionAction
import javax.swing.JPanel

@Service
class ConnectionManager {

    fun createToolBar(connectionPanel: JPanel): ActionToolbar {
        val actions = DefaultActionGroup()
        actions.add(AddConnectionAction())
        actions.addSeparator()

        val toolBar = ActionManager.getInstance().createActionToolbar("ToolwindowToolbar", actions, true)
        toolBar.targetComponent = connectionPanel
        toolBar.adjustTheSameSize(true)
        return toolBar
    }
}