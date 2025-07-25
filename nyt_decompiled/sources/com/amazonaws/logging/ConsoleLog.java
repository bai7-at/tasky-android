package com.amazonaws.logging;

import com.amazonaws.logging.LogFactory;
import java.io.PrintStream;

/* loaded from: classes.dex */
public final class ConsoleLog implements Log {
    private LogFactory.Level level = null;
    private final String tag;

    public ConsoleLog(String str) {
        this.tag = str;
    }

    private LogFactory.Level getLevel() {
        LogFactory.Level level = this.level;
        return level != null ? level : LogFactory.getLevel();
    }

    private void log(LogFactory.Level level, Object obj, Throwable th) {
        PrintStream printStream = System.out;
        printStream.printf("%s/%s: %s\n", this.tag, level.name(), obj);
        if (th != null) {
            printStream.println(th.toString());
        }
    }

    @Override // com.amazonaws.logging.Log
    public void debug(Object obj) {
        if (isDebugEnabled()) {
            log(LogFactory.Level.DEBUG, obj, null);
        }
    }

    @Override // com.amazonaws.logging.Log
    public void error(Object obj) {
        if (isErrorEnabled()) {
            log(LogFactory.Level.ERROR, obj, null);
        }
    }

    @Override // com.amazonaws.logging.Log
    public void info(Object obj) {
        if (isInfoEnabled()) {
            log(LogFactory.Level.INFO, obj, null);
        }
    }

    @Override // com.amazonaws.logging.Log
    public boolean isDebugEnabled() {
        return getLevel() == null || getLevel().getValue() <= LogFactory.Level.DEBUG.getValue();
    }

    @Override // com.amazonaws.logging.Log
    public boolean isErrorEnabled() {
        return getLevel() == null || getLevel().getValue() <= LogFactory.Level.ERROR.getValue();
    }

    @Override // com.amazonaws.logging.Log
    public boolean isInfoEnabled() {
        return getLevel() == null || getLevel().getValue() <= LogFactory.Level.INFO.getValue();
    }

    @Override // com.amazonaws.logging.Log
    public boolean isTraceEnabled() {
        return getLevel() == null || getLevel().getValue() <= LogFactory.Level.TRACE.getValue();
    }

    @Override // com.amazonaws.logging.Log
    public boolean isWarnEnabled() {
        return getLevel() == null || getLevel().getValue() <= LogFactory.Level.WARN.getValue();
    }

    @Override // com.amazonaws.logging.Log
    public void setLevel(LogFactory.Level level) {
        this.level = level;
    }

    @Override // com.amazonaws.logging.Log
    public void trace(Object obj) {
        if (isTraceEnabled()) {
            log(LogFactory.Level.TRACE, obj, null);
        }
    }

    @Override // com.amazonaws.logging.Log
    public void warn(Object obj) {
        if (isWarnEnabled()) {
            log(LogFactory.Level.WARN, obj, null);
        }
    }

    @Override // com.amazonaws.logging.Log
    public void debug(Object obj, Throwable th) {
        if (isDebugEnabled()) {
            log(LogFactory.Level.DEBUG, obj, th);
        }
    }

    @Override // com.amazonaws.logging.Log
    public void error(Object obj, Throwable th) {
        if (isErrorEnabled()) {
            log(LogFactory.Level.ERROR, obj, th);
        }
    }

    @Override // com.amazonaws.logging.Log
    public void info(Object obj, Throwable th) {
        if (isInfoEnabled()) {
            log(LogFactory.Level.INFO, obj, th);
        }
    }

    @Override // com.amazonaws.logging.Log
    public void trace(Object obj, Throwable th) {
        if (isTraceEnabled()) {
            log(LogFactory.Level.TRACE, obj, th);
        }
    }

    @Override // com.amazonaws.logging.Log
    public void warn(Object obj, Throwable th) {
        if (isWarnEnabled()) {
            log(LogFactory.Level.WARN, obj, th);
        }
    }
}
