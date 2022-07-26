package com.s2m.gbmagent.Model;

import androidx.fragment.app.DialogFragment;

public class ServiceObject {

    private String name;

    private int fragment;

    private int index;

    private DialogFragment dialog;

    private String tag;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFragment() {
        return fragment;
    }

    public void setFragment(int fragment) {
        this.fragment = fragment;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public DialogFragment getDialog() {
        return dialog;
    }

    public void setDialog(DialogFragment dialog) {
        this.dialog = dialog;
    }
}
