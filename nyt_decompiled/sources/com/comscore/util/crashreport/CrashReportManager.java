package com.comscore.util.crashreport;

import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class CrashReportManager {
    public static final int MAX_REPORTS_TO_SEND = 1;
    public static final String REPORT_URL = "https://sb.scorecardresearch.com/p2";
    public static final int TIME_WINDOW = 5000;
    private CrashReportDecorator h;
    private final Object b = new Object();
    private final Object c = new Object();
    private Runnable i = null;
    private final List<CrashReport> a = Collections.synchronizedList(new ArrayList());
    private boolean f = false;
    private CrashReportParser g = new HttpGetCrashReportParser();
    private CrashReportFlusher d = createCrashReportFlusher();
    private ExecutorService e = new ThreadPoolExecutor(0, 1, 150, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT);
            } catch (InterruptedException unused) {
            }
            CrashReportManager.this.f = true;
            CrashReportManager.this.flushReportsErrors();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<CrashReport> arrayList;
            try {
                synchronized (CrashReportManager.this.b) {
                    arrayList = new ArrayList(CrashReportManager.this.a);
                }
                if (arrayList.size() == 0) {
                    return;
                }
                LinkedList linkedList = new LinkedList();
                for (CrashReport crashReport : arrayList) {
                    CrashReportManager.this.h.fillCrashReport(crashReport);
                    if (CrashReportManager.this.d.flush(CrashReportManager.REPORT_URL, CrashReportManager.this.g, crashReport)) {
                        linkedList.add(crashReport);
                    }
                }
                if (linkedList.size() > 0) {
                    synchronized (CrashReportManager.this.b) {
                        CrashReportManager.this.a.removeAll(linkedList);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public CrashReportManager(CrashReportDecorator crashReportDecorator) {
        this.h = crashReportDecorator;
    }

    public void addReport(CrashReport crashReport) {
        if (crashReport == null) {
            return;
        }
        synchronized (this.b) {
            try {
                if (this.a.size() < 1) {
                    this.a.add(crashReport);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        flushReportsErrors();
    }

    protected CrashReportFlusher createCrashReportFlusher() {
        return new CrashReportHttpFlusher();
    }

    protected void flushReportsErrors() {
        synchronized (this.c) {
            try {
                if (this.f) {
                    this.e.execute(new b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected List<CrashReport> getReports() {
        return this.a;
    }

    public void start() {
        synchronized (this.c) {
            try {
                if (this.i != null) {
                    return;
                }
                a aVar = new a();
                this.i = aVar;
                this.e.execute(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
