package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class AFc1lSDK implements Runnable {
    final ExecutorService values;
    public Executor AFKeystoreWrapper = Executors.newSingleThreadExecutor();
    private Timer afDebugLog = new Timer(true);
    public final List<AFc1qSDK> AFInAppEventParameterName = new CopyOnWriteArrayList();
    final Set<AFc1jSDK> valueOf = new CopyOnWriteArraySet();
    final Set<AFc1jSDK> AFInAppEventType = Collections.newSetFromMap(new ConcurrentHashMap());
    final NavigableSet<AFc1nSDK<?>> afInfoLog = new ConcurrentSkipListSet();
    final NavigableSet<AFc1nSDK<?>> afErrorLog = new ConcurrentSkipListSet();
    final List<AFc1nSDK<?>> afRDLog = new ArrayList();
    final Set<AFc1nSDK<?>> AFLogger = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: com.appsflyer.internal.AFc1lSDK$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        private /* synthetic */ AFc1nSDK values;

        public AnonymousClass4(AFc1nSDK aFc1nSDK) {
            this.values = aFc1nSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean add;
            synchronized (AFc1lSDK.this.afInfoLog) {
                try {
                    if (AFc1lSDK.this.AFLogger.contains(this.values)) {
                        StringBuilder sb = new StringBuilder("QUEUE: tried to add already running task: ");
                        sb.append(this.values);
                        AFLogger.afDebugLog(sb.toString());
                        return;
                    }
                    if (!AFc1lSDK.this.afInfoLog.contains(this.values) && !AFc1lSDK.this.afErrorLog.contains(this.values)) {
                        AFc1lSDK.valueOf(AFc1lSDK.this, this.values);
                        if (AFc1lSDK.this.AFInAppEventType(this.values)) {
                            add = AFc1lSDK.this.afInfoLog.add(this.values);
                        } else {
                            add = AFc1lSDK.this.afErrorLog.add(this.values);
                            if (add) {
                                StringBuilder sb2 = new StringBuilder("QUEUE: new task was blocked: ");
                                sb2.append(this.values);
                                AFLogger.afDebugLog(sb2.toString());
                                this.values.valueOf();
                            }
                        }
                        if (add) {
                            AFc1lSDK aFc1lSDK = AFc1lSDK.this;
                            aFc1lSDK.afInfoLog.addAll(aFc1lSDK.afRDLog);
                            AFc1lSDK.this.afRDLog.clear();
                        } else {
                            StringBuilder sb3 = new StringBuilder("QUEUE: task not added, it's already in the queue: ");
                            sb3.append(this.values);
                            AFLogger.afDebugLog(sb3.toString());
                        }
                        if (!add) {
                            StringBuilder sb4 = new StringBuilder("QUEUE: tried to add already pending task: ");
                            sb4.append(this.values);
                            AFLogger.afWarnLog(sb4.toString());
                            return;
                        }
                        AFc1lSDK.this.AFInAppEventType.add(this.values.AFInAppEventParameterName);
                        StringBuilder sb5 = new StringBuilder("QUEUE: new task added: ");
                        sb5.append(this.values);
                        AFLogger.afDebugLog(sb5.toString());
                        Iterator<AFc1qSDK> it2 = AFc1lSDK.this.AFInAppEventParameterName.iterator();
                        while (it2.hasNext()) {
                            it2.next();
                        }
                        AFc1lSDK aFc1lSDK2 = AFc1lSDK.this;
                        aFc1lSDK2.values.submit(aFc1lSDK2);
                        AFc1lSDK.AFKeystoreWrapper(AFc1lSDK.this);
                        return;
                    }
                    StringBuilder sb6 = new StringBuilder("QUEUE: tried to add already scheduled task: ");
                    sb6.append(this.values);
                    AFLogger.afDebugLog(sb6.toString());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public AFc1lSDK(ExecutorService executorService) {
        this.values = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean AFInAppEventType(AFc1nSDK<?> aFc1nSDK) {
        return this.valueOf.containsAll(aFc1nSDK.valueOf);
    }

    static /* synthetic */ void AFKeystoreWrapper(AFc1lSDK aFc1lSDK) {
        synchronized (aFc1lSDK.afInfoLog) {
            try {
                for (int size = (aFc1lSDK.afInfoLog.size() + aFc1lSDK.afErrorLog.size()) - 40; size > 0; size--) {
                    boolean isEmpty = aFc1lSDK.afErrorLog.isEmpty();
                    boolean isEmpty2 = aFc1lSDK.afInfoLog.isEmpty();
                    if (isEmpty2 || isEmpty) {
                        if (!isEmpty2) {
                            aFc1lSDK.AFInAppEventParameterName(aFc1lSDK.afInfoLog);
                        } else if (!isEmpty) {
                            aFc1lSDK.AFInAppEventParameterName(aFc1lSDK.afErrorLog);
                        }
                    } else if (aFc1lSDK.afInfoLog.first().compareTo(aFc1lSDK.afErrorLog.first()) > 0) {
                        aFc1lSDK.AFInAppEventParameterName(aFc1lSDK.afInfoLog);
                    } else {
                        aFc1lSDK.AFInAppEventParameterName(aFc1lSDK.afErrorLog);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* synthetic */ void valueOf(AFc1lSDK aFc1lSDK, AFc1nSDK aFc1nSDK) {
        for (AFc1jSDK aFc1jSDK : aFc1nSDK.values) {
            if (aFc1lSDK.AFInAppEventType.contains(aFc1jSDK)) {
                aFc1nSDK.valueOf.add(aFc1jSDK);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.afInfoLog) {
            try {
                final AFc1nSDK<?> pollFirst = this.afInfoLog.pollFirst();
                if (pollFirst == null) {
                    return;
                }
                this.AFLogger.add(pollFirst);
                long AFKeystoreWrapper = pollFirst.AFKeystoreWrapper();
                AFc1kSDK aFc1kSDK = new AFc1kSDK(Thread.currentThread());
                if (AFKeystoreWrapper > 0) {
                    this.afDebugLog.schedule(aFc1kSDK, AFKeystoreWrapper);
                }
                this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFc1lSDK.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator<AFc1qSDK> it2 = AFc1lSDK.this.AFInAppEventParameterName.iterator();
                        while (it2.hasNext()) {
                            it2.next().values(pollFirst);
                        }
                    }
                });
                if (!this.afInfoLog.isEmpty()) {
                    this.values.submit(this);
                }
                try {
                    AFLogger.afDebugLog("QUEUE: starting task execution: ".concat(String.valueOf(pollFirst)));
                    final AFc1rSDK call = pollFirst.call();
                    aFc1kSDK.cancel();
                    this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFc1lSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb = new StringBuilder("QUEUE: execution finished for ");
                            sb.append(pollFirst);
                            sb.append(", result: ");
                            sb.append(call);
                            AFLogger.afDebugLog(sb.toString());
                            AFc1lSDK.this.AFLogger.remove(pollFirst);
                            Iterator<AFc1qSDK> it2 = AFc1lSDK.this.AFInAppEventParameterName.iterator();
                            while (it2.hasNext()) {
                                it2.next().AFInAppEventType(pollFirst, call);
                            }
                            if (call == AFc1rSDK.SUCCESS) {
                                AFc1lSDK.this.valueOf.add(pollFirst.AFInAppEventParameterName);
                                AFc1lSDK.AFInAppEventParameterName(AFc1lSDK.this);
                                return;
                            }
                            if (!pollFirst.AFInAppEventType()) {
                                AFc1lSDK.this.valueOf.add(pollFirst.AFInAppEventParameterName);
                                AFc1lSDK.AFInAppEventParameterName(AFc1lSDK.this);
                                return;
                            }
                            synchronized (AFc1lSDK.this.afInfoLog) {
                                try {
                                    AFc1lSDK.this.afRDLog.add(pollFirst);
                                    Iterator<AFc1qSDK> it3 = AFc1lSDK.this.AFInAppEventParameterName.iterator();
                                    while (it3.hasNext()) {
                                        it3.next();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    });
                } catch (InterruptedIOException | InterruptedException unused) {
                    AFLogger.afDebugLog("QUEUE: task was interrupted: ".concat(String.valueOf(pollFirst)));
                    final AFc1rSDK aFc1rSDK = AFc1rSDK.TIMEOUT;
                    pollFirst.AFInAppEventType = aFc1rSDK;
                    this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFc1lSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb = new StringBuilder("QUEUE: execution finished for ");
                            sb.append(pollFirst);
                            sb.append(", result: ");
                            sb.append(aFc1rSDK);
                            AFLogger.afDebugLog(sb.toString());
                            AFc1lSDK.this.AFLogger.remove(pollFirst);
                            Iterator<AFc1qSDK> it2 = AFc1lSDK.this.AFInAppEventParameterName.iterator();
                            while (it2.hasNext()) {
                                it2.next().AFInAppEventType(pollFirst, aFc1rSDK);
                            }
                            if (aFc1rSDK == AFc1rSDK.SUCCESS) {
                                AFc1lSDK.this.valueOf.add(pollFirst.AFInAppEventParameterName);
                                AFc1lSDK.AFInAppEventParameterName(AFc1lSDK.this);
                                return;
                            }
                            if (!pollFirst.AFInAppEventType()) {
                                AFc1lSDK.this.valueOf.add(pollFirst.AFInAppEventParameterName);
                                AFc1lSDK.AFInAppEventParameterName(AFc1lSDK.this);
                                return;
                            }
                            synchronized (AFc1lSDK.this.afInfoLog) {
                                try {
                                    AFc1lSDK.this.afRDLog.add(pollFirst);
                                    Iterator<AFc1qSDK> it3 = AFc1lSDK.this.AFInAppEventParameterName.iterator();
                                    while (it3.hasNext()) {
                                        it3.next();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    });
                } catch (Throwable unused2) {
                    aFc1kSDK.cancel();
                    final AFc1rSDK aFc1rSDK2 = AFc1rSDK.FAILURE;
                    this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFc1lSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb = new StringBuilder("QUEUE: execution finished for ");
                            sb.append(pollFirst);
                            sb.append(", result: ");
                            sb.append(aFc1rSDK2);
                            AFLogger.afDebugLog(sb.toString());
                            AFc1lSDK.this.AFLogger.remove(pollFirst);
                            Iterator<AFc1qSDK> it2 = AFc1lSDK.this.AFInAppEventParameterName.iterator();
                            while (it2.hasNext()) {
                                it2.next().AFInAppEventType(pollFirst, aFc1rSDK2);
                            }
                            if (aFc1rSDK2 == AFc1rSDK.SUCCESS) {
                                AFc1lSDK.this.valueOf.add(pollFirst.AFInAppEventParameterName);
                                AFc1lSDK.AFInAppEventParameterName(AFc1lSDK.this);
                                return;
                            }
                            if (!pollFirst.AFInAppEventType()) {
                                AFc1lSDK.this.valueOf.add(pollFirst.AFInAppEventParameterName);
                                AFc1lSDK.AFInAppEventParameterName(AFc1lSDK.this);
                                return;
                            }
                            synchronized (AFc1lSDK.this.afInfoLog) {
                                try {
                                    AFc1lSDK.this.afRDLog.add(pollFirst);
                                    Iterator<AFc1qSDK> it3 = AFc1lSDK.this.AFInAppEventParameterName.iterator();
                                    while (it3.hasNext()) {
                                        it3.next();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void AFInAppEventParameterName(NavigableSet<AFc1nSDK<?>> navigableSet) {
        AFc1nSDK<?> pollFirst = navigableSet.pollFirst();
        this.valueOf.add(pollFirst.AFInAppEventParameterName);
        Iterator<AFc1qSDK> it2 = this.AFInAppEventParameterName.iterator();
        while (it2.hasNext()) {
            it2.next().AFInAppEventType(pollFirst);
        }
    }

    static /* synthetic */ void AFInAppEventParameterName(AFc1lSDK aFc1lSDK) {
        synchronized (aFc1lSDK.afInfoLog) {
            try {
                Iterator<AFc1nSDK<?>> it2 = aFc1lSDK.afErrorLog.iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    AFc1nSDK<?> next = it2.next();
                    if (aFc1lSDK.AFInAppEventType(next)) {
                        it2.remove();
                        aFc1lSDK.afInfoLog.add(next);
                        z = true;
                    }
                }
                if (z) {
                    aFc1lSDK.values.submit(aFc1lSDK);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
