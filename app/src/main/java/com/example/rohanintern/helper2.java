package com.example.rohanintern;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class helper2 {

    public static final String FILENAME ="List1.dat";
    public static void Write(ArrayList<String> item, Context context)
    {
        try  {
            FileOutputStream f = context.openFileOutput(FILENAME,context.MODE_PRIVATE);
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(item);
            o.close();
        }

        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static ArrayList<String> read(Context context)
    {
        ArrayList<String>  itemlist = null;
        try {
            FileInputStream f = context.openFileInput(FILENAME);
            ObjectInputStream o = new ObjectInputStream(f);
            itemlist = (ArrayList<String>) o.readObject();


        } catch (FileNotFoundException e){
            itemlist = new ArrayList<>();

            e.printStackTrace();

        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return itemlist;
    }
}



