package com.kreitek.editor;

public class EditorFactory {
    public Editor getEditor() {
        return new ConsoleEditor();
    }
    public Editor getJSON() {
        return new ConsoleJSON();
    }
}
