package com.jason.library;

import com.jason.library.imageloader.ILoader;

public class LibraryConf {
    // #log
    public static final boolean LOG = true;
    public static final String LOG_TAG = "Library";

    // #cache
    public static final String CACHE_SP_NAME = "config";
    public static final String CACHE_DISK_DIR = "cache";

    // #imageloader
    public static final int IL_LOADING_RES = ILoader.Options.RES_NONE;
    public static final int IL_ERROR_RES = ILoader.Options.RES_NONE;

    // # dev model
    public static final boolean DEV = true;
}
