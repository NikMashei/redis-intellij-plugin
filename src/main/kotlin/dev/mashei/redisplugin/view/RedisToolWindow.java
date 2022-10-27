package dev.mashei.redisplugin.view;

import com.intellij.openapi.project.Project;
import javax.swing.JPanel;

public class RedisToolWindow {

    private final Project project;
    private JPanel redisWindowContent;

    public RedisToolWindow(Project project) {
        this.project = project;
    }

    public JPanel getContent() {
        return redisWindowContent;
    }

}
