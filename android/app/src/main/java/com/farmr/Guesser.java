package com.farmr;

import org.tensorflow.demo.Classifier;
import org.tensorflow.demo.TensorFlowImageClassifier;

public class Guesser{
    public static final String MODEL_FILE = "",
                            LABEL_FILE = "",
                            INPUT_NAME = "input:0",
                            OUTPUT_NAME = "output:0";
    private static final int NUM_CLASSES = 1001;
    private static final int INPUT_SIZE = 224;
    private static final int IMAGE_MEAN = 117;
    private static final float IMAGE_STD = 1;
    
    private static AssetManager manager = null;
    
    private static Classifier singleton; 
    
    
    private static Classifier getClassifier(AssetManager manager){
        if (manager != null){
            this.manager = manager;
        }
        if (this.manager != null){
            singleton = singleton == null ? TensorFlowImageClassifier.create(this.manager, MODEL_FILE, LABEL_FILE, NUM_CLASSES, INPUT_SIZE, IMAGE_MEAN, IMAGE_STD, INPUT_NAME, OUTPUT_NAME) : singleton;
        }
        return singleton;
    }
    
    public static result 
    
}