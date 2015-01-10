package com.anaptic.project.Script;

import java.util.LinkedList;

/**
 *
 * @author Jack
 */
public class ScriptManager {
    protected static LinkedList<Script> scripts = new LinkedList();
    
    public static class Priority {
        public static int HIGH = 1;
        public static int NORMAL = 2;
        public static int LOW = 3;
    }

    
    public static void addScript(Script s) {
        scripts.add(s);
        s.init();
    }
} 
