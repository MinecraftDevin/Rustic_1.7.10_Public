package com.bigbaddevil7.rustic.utility;

import com.bigbaddevil7.rustic.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

/**
 * Created by bigbaddevil7 on 10/3/2014.
 */
public class LogHelper {
    public static void log(Level logLevel, Object object){// take the loglevel example "DEBUG", and takes a string what you want it to say
        FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(object));
    }

    public static void all(Object object) {log(Level.ALL, object);}
    public static void debug(Object object) {log(Level.DEBUG, object);}
    public static void error(Object object) {log(Level.ERROR, object);}
    public static void fatal(Object object) {log(Level.FATAL, object);}
    public static void info(Object object) {log(Level.INFO, object);}
    public static void off(Object object) {log(Level.OFF, object);}
    public static void trace(Object object) {log(Level.TRACE, object);}
    public static void warn(Object object) {log(Level.WARN, object);}
}
