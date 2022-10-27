package dev.mashei.redisplugin.view;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class RedisToolWindow {

    private final Project project;
    private final ToolWindow toolWindow;

    private JPanel redisWindowContent;
    private JPanel connectionPanel;

    public RedisToolWindow(Project project, ToolWindow toolWindow) {
        this.project = project;
        this.toolWindow = toolWindow;
    }

    public JPanel getContent() {
        return redisWindowContent;
    }

    private void createUIComponents() {
        connectionPanel = new JPanel();
        connectionPanel.setLayout(new BorderLayout());
        connectionPanel.add(
                project.getService(ConnectionManager.class).createToolBar(connectionPanel).getComponent(),
                BorderLayout.NORTH
        );
    }
}
