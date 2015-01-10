package com.anaptic.project.Script;


import com.anaptic.project.Script.ScriptManager.Priority;

/**
 *
 * @author Jack
 */
public interface Script {
    Boolean paused = false;
    int piority = Priority.NORMAL;
    
    void init();
    void cycle();
    void dispose();
    void pause();
    void unpause();
    void getInstange();
}
