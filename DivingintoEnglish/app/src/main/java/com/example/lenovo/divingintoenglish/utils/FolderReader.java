package com.example.lenovo.divingintoenglish.utils;

import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FolderReader {

    public static List<String> getFileNameList(String path) {
        path = Environment.getExternalStorageDirectory().toString();
        Log.d("Files", "Path: " + path);
        File directory = new File(path);
        File[] files = directory.listFiles();
        List<String> fileNameList = new ArrayList();
        Log.d("Files", "Size: " + files.length);
        for (int i = 0; i < files.length; i++) {
            Log.d("Files", "FileName:" + files[i].getName());
            fileNameList.add(files[i].getName());
        }
        return fileNameList;
    }
}
//path = Environment.getExternalStorageDirectory().toString() + "/raw";