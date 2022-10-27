package dev.mashei.redisplugin.dialog

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.dsl.builder.bindText
import com.intellij.ui.dsl.builder.panel
import org.jetbrains.annotations.ApiStatus
import javax.swing.JComponent

class NewConnectionDialog(project: Project) : DialogWrapper(project) {

    private val connection: Connection = Connection()

    override fun createCenterPanel(): JComponent {
        return panel {
            row("Host:") {
                textField()
                    .bindText(connection::host)
            }
            row("Port:") {
                textField()
                    .bindText(connection::port)
            }
        }
    }

    @ApiStatus.Internal
    internal data class Connection(
        var host: String = "localhost",
        var port: String = "6379"
    )

    init {
        this.title = "Connection Settings"
        this.setSize(650, 240)
        super.init()
    }
}