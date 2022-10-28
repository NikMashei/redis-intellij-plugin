package dev.mashei.redisplugin.dialog

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.dsl.builder.TopGap
import com.intellij.ui.dsl.builder.bindText
import com.intellij.ui.dsl.builder.panel
import com.intellij.ui.dsl.gridLayout.HorizontalAlign
import org.jetbrains.annotations.ApiStatus
import javax.swing.JComponent

class NewConnectionDialog(project: Project) : DialogWrapper(project) {

    private val connection: Connection = Connection()

    override fun createCenterPanel(): JComponent {
        return panel {
            group("Connection Settings") {
                row("Host:") {
                    textField()
                        .horizontalAlign(HorizontalAlign.FILL)
                        .bindText(connection::host)
                }
                row("Port:") {
                    textField()
                        .horizontalAlign(HorizontalAlign.FILL)
                        .bindText(connection::port)
                }
            }
            row {
                button("Test Connection") {
                    println("Test connection clicked")
                }
            }.topGap(TopGap.MEDIUM)
        }
    }

    @ApiStatus.Internal
    internal data class Connection(
        var host: String = "localhost",
        var port: String = "6379"
    )

    init {
        this.title = "Connection Settings"
        this.setSize(375, 240)
        super.init()
    }
}