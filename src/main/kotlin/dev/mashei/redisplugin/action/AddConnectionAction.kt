package dev.mashei.redisplugin.action

import com.intellij.icons.AllIcons
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import dev.mashei.redisplugin.dialog.NewConnectionDialog

class AddConnectionAction : AnAction("Add", "Add", AllIcons.General.Add) {

    override fun actionPerformed(e: AnActionEvent) {
        NewConnectionDialog(e.project!!).show()
    }
}