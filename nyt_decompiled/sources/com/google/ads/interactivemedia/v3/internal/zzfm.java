package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.impl.data.AdImpl;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import com.google.ads.interactivemedia.v3.impl.data.CuePointData;
import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.me5;
import defpackage.og8;
import defpackage.qg8;
import defpackage.re9;
import defpackage.vg8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zzfm implements zzfq, zzfr {
    private final Context zzg;
    private final String zzh;
    private final zzft zzi;
    private final float zzk;
    private final ExecutorService zzl;
    private final TestingConfiguration zzm;
    private final qg8 zzn;
    private final qg8 zzo;
    private zzgc zzp;
    private zzfl zzq;
    private long zzr;
    private boolean zzs;
    private final Map zza = new HashMap();
    private final Set zzb = new HashSet();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final Map zzf = new HashMap();
    private final Queue zzj = new ConcurrentLinkedQueue();

    public zzfm(zzft zzftVar, Context context, Uri uri, ImaSdkSettings imaSdkSettings, ExecutorService executorService) {
        qg8 qg8Var = new qg8();
        this.zzn = qg8Var;
        qg8 qg8Var2 = new qg8();
        this.zzo = qg8Var2;
        this.zzs = false;
        this.zzg = context;
        this.zzk = context.getResources().getDisplayMetrics().density;
        boolean a = re9.a("WEB_MESSAGE_LISTENER");
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("sdk_version", "a.3.30.3").appendQueryParameter("hl", imaSdkSettings.getLanguage()).appendQueryParameter("omv", "1.3.37-google_20220829").appendQueryParameter("app", context.getApplicationContext().getPackageName());
        appendQueryParameter.appendQueryParameter("mt", true != a ? "0" : "4");
        if (imaSdkSettings.getTestingConfig() != null) {
            zzwn zzwnVar = new zzwn();
            zzwnVar.zzc(new zzra());
            zzwnVar.zzd(new zzqz());
            appendQueryParameter.appendQueryParameter("tcnfp", zzwnVar.zza().zzf(imaSdkSettings.getTestingConfig()));
        }
        this.zzh = appendQueryParameter.build().toString();
        this.zzm = imaSdkSettings.getTestingConfig();
        this.zzi = zzftVar;
        zzftVar.zzg(this);
        this.zzl = executorService;
        vg8.i(qg8Var2.a(), qg8Var.a()).b(new me5() { // from class: com.google.ads.interactivemedia.v3.internal.zzfg
            @Override // defpackage.me5
            public final void onComplete(og8 og8Var) {
                zzfm.this.zzk(og8Var);
            }
        });
    }

    private static String zzq(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return str + " Caused by: " + str2;
    }

    private final void zzr(zzfd zzfdVar, zzfe zzfeVar, String str, JavaScriptMsgData javaScriptMsgData) {
        zzgn zzgnVar = (zzgn) this.zzf.get(str);
        if (zzgnVar != null) {
            zzgnVar.zzf(zzfdVar, zzfeVar, javaScriptMsgData);
            return;
        }
        zzhd.zzd("Received " + String.valueOf(zzfdVar) + " message: " + String.valueOf(zzfeVar) + " for invalid session id: " + str);
    }

    private static final void zzs(String str, zzfe zzfeVar) {
        zzhd.zzc("Illegal message type " + String.valueOf(zzfeVar) + " received for " + str + " channel");
    }

    public final WebView zza() {
        return this.zzi.zza();
    }

    final TestingConfiguration zzb() {
        return this.zzm;
    }

    final og8 zzc() {
        this.zzr = SystemClock.elapsedRealtime();
        this.zzi.zze(this.zzh);
        return this.zzo.a();
    }

    public final void zzd(zzfh zzfhVar, String str) {
        this.zza.put(str, zzfhVar);
    }

    public final void zze(BaseDisplayContainer baseDisplayContainer, String str) {
        this.zzc.put(str, baseDisplayContainer);
    }

    public final void zzf(zzfi zzfiVar, String str) {
        this.zzd.put(str, zzfiVar);
    }

    public final void zzg(zzfk zzfkVar, String str) {
        this.zze.put(str, zzfkVar);
    }

    public final void zzh(zzfl zzflVar) {
        this.zzq = zzflVar;
    }

    public final void zzi(zzgn zzgnVar, String str) {
        this.zzf.put(str, zzgnVar);
    }

    final void zzj(com.google.ads.interactivemedia.v3.impl.data.zzbc zzbcVar) {
        this.zzn.e(zzbcVar);
    }

    final /* synthetic */ void zzk(og8 og8Var) {
        JavaScriptMsgData javaScriptMsgData = (JavaScriptMsgData) this.zzo.a().m();
        com.google.ads.interactivemedia.v3.impl.data.zzbc zzbcVar = (com.google.ads.interactivemedia.v3.impl.data.zzbc) this.zzn.a().m();
        Context context = this.zzg;
        this.zzp = new zzgc(context, this, this.zzl, javaScriptMsgData.enableGks ? new zzgb(context, zzbcVar) : new zzfz(null));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfq
    public final void zzl(zzff zzffVar) {
        AdImpl adImpl;
        Map<String, CompanionData> map;
        String str;
        String str2;
        JavaScriptMsgData javaScriptMsgData = (JavaScriptMsgData) zzffVar.zze();
        String zzf = zzffVar.zzf();
        zzfe zzb = zzffVar.zzb();
        zzhd.zzc("Received js message: " + zzffVar.zza().name() + " [" + zzb.name() + "]");
        switch (zzffVar.zza()) {
            case activityMonitor:
                if (!this.zzb.contains(zzf)) {
                    zzfh zzfhVar = (zzfh) this.zza.get(zzf);
                    if (zzfhVar == null) {
                        zzhd.zzd("Received monitor message: " + String.valueOf(zzb) + " for invalid session id: " + zzf);
                        break;
                    } else if (javaScriptMsgData == null) {
                        zzhd.zzd("Received monitor message: " + String.valueOf(zzb) + " for session id: " + zzf + " with no data");
                        break;
                    } else if (zzb.ordinal() != 37) {
                        zzs(zzfd.activityMonitor.toString(), zzb);
                        break;
                    } else {
                        zzfhVar.zzh(javaScriptMsgData.queryId, javaScriptMsgData.eventId);
                        break;
                    }
                }
                break;
            case adsLoader:
                zzfi zzfiVar = (zzfi) this.zzd.get(zzf);
                if (zzfiVar == null) {
                    zzhd.zza("Received request message: " + String.valueOf(zzb) + " for invalid session id: " + zzf);
                    break;
                } else {
                    int ordinal = zzb.ordinal();
                    if (ordinal != 11) {
                        if (ordinal != 31) {
                            if (ordinal != 68) {
                                zzs(zzfd.adsLoader.toString(), zzb);
                                break;
                            } else {
                                zzfiVar.zzd(zzf, javaScriptMsgData.streamId, javaScriptMsgData.monitorAppLifecycle);
                                zzhd.zzc("Stream initialized with streamId: ".concat(String.valueOf(javaScriptMsgData.streamId)));
                                break;
                            }
                        } else {
                            zzfiVar.zza(zzf, AdError.AdErrorType.LOAD, javaScriptMsgData.errorCode, zzq(javaScriptMsgData.errorMessage, javaScriptMsgData.innerError));
                            break;
                        }
                    } else if (javaScriptMsgData == null) {
                        zzfiVar.zzb(zzf, AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "adsLoaded message did not contain cue points.");
                        break;
                    } else {
                        zzfiVar.zzc(zzf, javaScriptMsgData.adCuePoints, javaScriptMsgData.internalCuePoints, javaScriptMsgData.monitorAppLifecycle);
                        break;
                    }
                }
            case adsManager:
                zzfk zzfkVar = (zzfk) this.zze.get(zzf);
                if (zzfkVar == null) {
                    zzhd.zzd("Received manager message: " + String.valueOf(zzb) + " for invalid session id: " + zzf);
                    break;
                } else {
                    if (javaScriptMsgData == null || (adImpl = javaScriptMsgData.adData) == null) {
                        adImpl = null;
                    }
                    int ordinal2 = zzb.ordinal();
                    if (ordinal2 != 12) {
                        if (ordinal2 != 16) {
                            if (ordinal2 != 18) {
                                if (ordinal2 != 25) {
                                    if (ordinal2 != 44) {
                                        if (ordinal2 != 52) {
                                            if (ordinal2 != 61) {
                                                if (ordinal2 != 69) {
                                                    if (ordinal2 != 77) {
                                                        if (ordinal2 != 20) {
                                                            if (ordinal2 != 21) {
                                                                if (ordinal2 != 31) {
                                                                    if (ordinal2 != 32) {
                                                                        if (ordinal2 != 39) {
                                                                            if (ordinal2 != 40) {
                                                                                switch (ordinal2) {
                                                                                    case 1:
                                                                                        zzfkVar.zzb(new zzfj(AdEvent.AdEventType.AD_BREAK_ENDED, adImpl));
                                                                                        break;
                                                                                    case 2:
                                                                                        zzfj zzfjVar = new zzfj(AdEvent.AdEventType.AD_BREAK_FETCH_ERROR, null);
                                                                                        zzfjVar.zzc = zzsr.zzd("adBreakTime", javaScriptMsgData.adBreakTime);
                                                                                        zzfkVar.zzb(zzfjVar);
                                                                                        break;
                                                                                    case 3:
                                                                                        zzfj zzfjVar2 = new zzfj(AdEvent.AdEventType.AD_BREAK_READY, null);
                                                                                        zzfjVar2.zzc = zzsr.zzd("adBreakTime", javaScriptMsgData.adBreakTime);
                                                                                        zzfkVar.zzb(zzfjVar2);
                                                                                        break;
                                                                                    case 4:
                                                                                        zzfkVar.zzb(new zzfj(AdEvent.AdEventType.AD_BREAK_STARTED, adImpl));
                                                                                        break;
                                                                                    case 5:
                                                                                        zzfkVar.zzb(new zzfj(AdEvent.AdEventType.AD_BUFFERING, null));
                                                                                        break;
                                                                                    case 6:
                                                                                    case 7:
                                                                                        break;
                                                                                    case 8:
                                                                                        zzfkVar.zzb(new zzfj(AdEvent.AdEventType.AD_PERIOD_ENDED, null));
                                                                                        break;
                                                                                    case 9:
                                                                                        zzfkVar.zzb(new zzfj(AdEvent.AdEventType.AD_PERIOD_STARTED, null));
                                                                                        break;
                                                                                    case 10:
                                                                                        zzfj zzfjVar3 = new zzfj(AdEvent.AdEventType.AD_PROGRESS, adImpl);
                                                                                        zzfjVar3.zze = new zzdp(javaScriptMsgData.currentTime, javaScriptMsgData.duration, javaScriptMsgData.adPosition, javaScriptMsgData.totalAds, javaScriptMsgData.adBreakDuration, javaScriptMsgData.adPeriodDuration);
                                                                                        zzfkVar.zzb(zzfjVar3);
                                                                                        break;
                                                                                    default:
                                                                                        switch (ordinal2) {
                                                                                            case 46:
                                                                                                zzfj zzfjVar4 = new zzfj(AdEvent.AdEventType.LOG, adImpl);
                                                                                                zzfjVar4.zzc = javaScriptMsgData.logData.constructMap();
                                                                                                zzfkVar.zzb(zzfjVar4);
                                                                                                break;
                                                                                            case 47:
                                                                                                zzfkVar.zzb(new zzfj(AdEvent.AdEventType.MIDPOINT, adImpl));
                                                                                                break;
                                                                                            case 48:
                                                                                                break;
                                                                                            case 49:
                                                                                                zzfkVar.zzh(javaScriptMsgData.url);
                                                                                                break;
                                                                                            default:
                                                                                                switch (ordinal2) {
                                                                                                    case 63:
                                                                                                        zzfj zzfjVar5 = new zzfj(AdEvent.AdEventType.SKIPPED, null);
                                                                                                        zzfjVar5.zzg = javaScriptMsgData.seekTime;
                                                                                                        zzfkVar.zzb(zzfjVar5);
                                                                                                        break;
                                                                                                    case 64:
                                                                                                        zzfkVar.zzb(new zzfj(AdEvent.AdEventType.SKIPPABLE_STATE_CHANGED, adImpl));
                                                                                                        break;
                                                                                                    case 65:
                                                                                                        zzfkVar.zzb(new zzfj(AdEvent.AdEventType.STARTED, adImpl));
                                                                                                        break;
                                                                                                    default:
                                                                                                        switch (ordinal2) {
                                                                                                            case ModuleDescriptor.MODULE_VERSION /* 73 */:
                                                                                                                break;
                                                                                                            case 74:
                                                                                                                zzfkVar.zzb(new zzfj(AdEvent.AdEventType.TAPPED, adImpl));
                                                                                                                break;
                                                                                                            case 75:
                                                                                                                zzfj zzfjVar6 = new zzfj(AdEvent.AdEventType.ICON_TAPPED, null);
                                                                                                                if (javaScriptMsgData != null) {
                                                                                                                    zzfjVar6.zzf = javaScriptMsgData.iconClickFallbackImages;
                                                                                                                }
                                                                                                                zzfkVar.zzb(zzfjVar6);
                                                                                                                break;
                                                                                                            default:
                                                                                                                zzs(zzfd.adsManager.toString(), zzb);
                                                                                                                break;
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            zzfkVar.zzb(new zzfj(AdEvent.AdEventType.ICON_FALLBACK_IMAGE_CLOSED, null));
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        zzfkVar.zzb(new zzfj(AdEvent.AdEventType.FIRST_QUARTILE, adImpl));
                                                                        break;
                                                                    }
                                                                } else {
                                                                    zzfkVar.zzd(AdError.AdErrorType.PLAY, javaScriptMsgData.errorCode, zzq(javaScriptMsgData.errorMessage, javaScriptMsgData.innerError));
                                                                    break;
                                                                }
                                                            } else {
                                                                zzfkVar.zzb(new zzfj(AdEvent.AdEventType.CONTENT_RESUME_REQUESTED, null));
                                                                break;
                                                            }
                                                        } else {
                                                            zzfkVar.zzb(new zzfj(AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED, null));
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    zzfkVar.zzb(new zzfj(AdEvent.AdEventType.THIRD_QUARTILE, adImpl));
                                                    break;
                                                }
                                            } else {
                                                zzfkVar.zzb(new zzfj(AdEvent.AdEventType.RESUMED, adImpl));
                                                break;
                                            }
                                        } else {
                                            zzfkVar.zzb(new zzfj(AdEvent.AdEventType.PAUSED, adImpl));
                                            break;
                                        }
                                    } else if (adImpl != null) {
                                        zzfkVar.zzb(new zzfj(AdEvent.AdEventType.LOADED, adImpl));
                                        break;
                                    } else {
                                        zzhd.zza("Ad loaded message requires adData");
                                        zzfkVar.zze(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Ad loaded message did not contain adData.");
                                        break;
                                    }
                                } else {
                                    zzfj zzfjVar7 = new zzfj(AdEvent.AdEventType.CUEPOINTS_CHANGED, null);
                                    zzfjVar7.zzd = new ArrayList();
                                    for (CuePointData cuePointData : javaScriptMsgData.cuepoints) {
                                        zzfjVar7.zzd.add(new zzew(cuePointData.start(), cuePointData.end(), cuePointData.played()));
                                    }
                                    zzfkVar.zzb(zzfjVar7);
                                    break;
                                }
                            } else {
                                zzfkVar.zzb(new zzfj(AdEvent.AdEventType.COMPLETED, adImpl));
                                break;
                            }
                        } else {
                            zzfkVar.zzb(new zzfj(AdEvent.AdEventType.CLICKED, adImpl));
                            break;
                        }
                    } else {
                        zzfkVar.zzb(new zzfj(AdEvent.AdEventType.ALL_ADS_COMPLETED, null));
                        break;
                    }
                }
                break;
            case contentTimeUpdate:
            case userInteraction:
            default:
                zzhd.zza("Unknown message channel: ".concat(String.valueOf(zzffVar.zza())));
                break;
            case displayContainer:
                zzeo zzeoVar = (zzeo) this.zzc.get(zzf);
                zzfk zzfkVar2 = (zzfk) this.zze.get(zzf);
                zzgn zzgnVar = (zzgn) this.zzf.get(zzf);
                if (zzeoVar == null || zzfkVar2 == null || zzgnVar == null) {
                    zzhd.zza("Received displayContainer message: " + String.valueOf(zzb) + " for invalid session id: " + zzf);
                    break;
                } else {
                    int ordinal3 = zzb.ordinal();
                    if (ordinal3 == 28) {
                        if (javaScriptMsgData != null && (map = javaScriptMsgData.companions) != null) {
                            Set<String> keySet = map.keySet();
                            HashMap zzb2 = zztd.zzb(keySet.size());
                            for (String str3 : keySet) {
                                CompanionAdSlot companionAdSlot = (CompanionAdSlot) zzeoVar.zza().get(str3);
                                ViewGroup container = companionAdSlot != null ? companionAdSlot.getContainer() : null;
                                if (container != null) {
                                    zzb2.put(str3, container);
                                } else {
                                    zzfkVar2.zze(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Display requested for invalid companion slot.");
                                }
                            }
                            for (String str4 : zzb2.keySet()) {
                                zzfkVar2.zzi((ViewGroup) zzb2.get(str4), javaScriptMsgData.companions.get(str4), zzf, (CompanionAdSlot) zzeoVar.zza().get(str4), this, new zzha(this.zzl, this.zzk));
                            }
                            break;
                        } else {
                            zzfkVar2.zze(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Display companions message requires companions in data.");
                            break;
                        }
                    } else if (ordinal3 != 38 && ordinal3 != 62) {
                        if (ordinal3 != 59) {
                            if (ordinal3 != 60) {
                                zzs(zzfd.displayContainer.toString(), zzb);
                                break;
                            } else {
                                zzfkVar2.zzk();
                                break;
                            }
                        } else {
                            zzfkVar2.zzj(javaScriptMsgData.resizeAndPositionVideo);
                            break;
                        }
                    }
                }
                break;
            case log:
            case webViewLoaded:
                int ordinal4 = zzb.ordinal();
                if (ordinal4 != 42) {
                    if (ordinal4 != 46) {
                        zzs("other", zzb);
                        break;
                    } else if (javaScriptMsgData.ln != null && (str = javaScriptMsgData.n) != null && (str2 = javaScriptMsgData.m) != null) {
                        String str5 = "JsMessage (" + str + "): " + str2;
                        char charAt = javaScriptMsgData.ln.charAt(0);
                        if (charAt != 'D') {
                            if (charAt != 'E') {
                                if (charAt != 'I') {
                                    if (charAt != 'S') {
                                        if (charAt != 'V') {
                                            if (charAt != 'W') {
                                                zzhd.zzd("Unrecognized log level: ".concat(String.valueOf(javaScriptMsgData.ln)));
                                                zzhd.zzd(str5);
                                                break;
                                            } else {
                                                zzhd.zzd(str5);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            zzhd.zza(str5);
                            break;
                        }
                        zzhd.zzc(str5);
                        break;
                    } else {
                        zzhd.zza("Invalid logging message data: ".concat(String.valueOf(javaScriptMsgData)));
                        break;
                    }
                } else {
                    this.zzo.e(javaScriptMsgData);
                    this.zzs = true;
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzr;
                    HashMap zzb3 = zztd.zzb(1);
                    zzb3.put("webViewLoadingTime", Long.valueOf(elapsedRealtime));
                    zzp(new zzff(zzfd.webViewLoaded, zzfe.csi, zzf, zzb3));
                    break;
                }
            case nativeXhr:
                zzgc zzgcVar = this.zzp;
                if (zzgcVar != null) {
                    zzgcVar.zzc(zzb, zzf, javaScriptMsgData.networkRequest);
                    break;
                } else {
                    zzhd.zza("Native network handler not initialized.");
                    break;
                }
            case omid:
                if (this.zzq == null) {
                    zzhd.zza("Null 'omidManagerListener': cannot send 'onOmidMessage'.");
                    break;
                } else {
                    int ordinal5 = zzb.ordinal();
                    if (ordinal5 == 50) {
                        this.zzq.zza();
                        break;
                    } else if (ordinal5 == 51) {
                        this.zzq.zzb();
                        break;
                    }
                }
                break;
            case videoDisplay1:
                zzr(zzfd.videoDisplay1, zzb, zzf, javaScriptMsgData);
                break;
            case videoDisplay2:
                zzr(zzfd.videoDisplay2, zzb, zzf, javaScriptMsgData);
                break;
        }
    }

    final void zzm() {
        this.zzi.zzb();
    }

    public final void zzn(String str) {
        this.zza.remove(str);
        this.zzb.add(str);
    }

    public final void zzo(String str) {
        this.zzd.remove(str);
        this.zze.remove(str);
        this.zzc.remove(str);
        this.zzf.remove(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfr
    public final void zzp(zzff zzffVar) {
        zzhd.zzc("Sending js message: " + zzffVar.zza().name() + " [" + zzffVar.zzb().name() + "]");
        this.zzj.add(zzffVar);
        if (this.zzs) {
            zzff zzffVar2 = (zzff) this.zzj.poll();
            while (zzffVar2 != null) {
                this.zzi.zzh(zzffVar2);
                zzffVar2 = (zzff) this.zzj.poll();
            }
        }
    }
}
