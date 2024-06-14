package io.github.colack.TrueEnds;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.prefs.Preferences;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TrueEnds {
    public static final boolean DEBUG = false;
    public static final String VERSION = "0.0.13";
    public static final String TITLE = "True Ends";
    public static final String AUTHOR = "Colack";

    public static final String TIME_PERIODMORNING = "Morning";
    public static final String TIME_PERIODAFTERNOON = "Afternoon";
    public static final String TIME_PERIODEVENING = "Evening";

    public static TreeMap<String, Boolean> SETTINGS = new TreeMap<>();
    public static TreeMap<String, String> DESCRIPTIONS = new TreeMap<>();

    public static TrueInstance instance;
}