package com.nytimes.android.subauth.core.auth.models;

import android.content.res.Resources;
import defpackage.b22;
import defpackage.hm6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class RegiInterface {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ RegiInterface[] $VALUES;
    private final int resourceId;
    public static final RegiInterface LinkGateway = new RegiInterface("LinkGateway", 0, hm6.subauth_lnk_gateway);
    public static final RegiInterface LinkMeter = new RegiInterface("LinkMeter", 1, hm6.subauth_lnk_meter);
    public static final RegiInterface LinkWelcome = new RegiInterface("LinkWelcome", 2, hm6.subauth_lnk_welcome);
    public static final RegiInterface LinkOverflow = new RegiInterface("LinkOverflow", 3, hm6.subauth_lnk_overflow);
    public static final RegiInterface LinkAd = new RegiInterface("LinkAd", 4, hm6.subauth_lnk_ad);
    public static final RegiInterface LinkDlSubscribe = new RegiInterface("LinkDlSubscribe", 5, hm6.subauth_lnk_dl_subscribe);
    public static final RegiInterface RegiOverflow = new RegiInterface("RegiOverflow", 6, hm6.subauth_reg_overflow);
    public static final RegiInterface RegiGrowl = new RegiInterface("RegiGrowl", 7, hm6.subauth_reg_growl);
    public static final RegiInterface RegiSaveSection = new RegiInterface("RegiSaveSection", 8, hm6.subauth_reg_savesection);
    public static final RegiInterface RegiSavePrompt = new RegiInterface("RegiSavePrompt", 9, hm6.subauth_reg_saveprompt);
    public static final RegiInterface RegiGateway = new RegiInterface("RegiGateway", 10, hm6.subauth_reg_gateway);
    public static final RegiInterface RegiMeter = new RegiInterface("RegiMeter", 11, hm6.subauth_reg_meter);
    public static final RegiInterface RegiSettings = new RegiInterface("RegiSettings", 12, hm6.subauth_reg_settings);
    public static final RegiInterface RegiWelcome = new RegiInterface("RegiWelcome", 13, hm6.subauth_reg_welcome);
    public static final RegiInterface RegiComments = new RegiInterface("RegiComments", 14, hm6.subauth_regi_comments);
    public static final RegiInterface RegiCooking = new RegiInterface("RegiCooking", 15, hm6.subauth_regi_cooking);
    public static final RegiInterface RegiForcedLogout = new RegiInterface("RegiForcedLogout", 16, hm6.subauth_regi_forcedlogout);
    public static final RegiInterface RegiRecentPrompt = new RegiInterface("RegiRecentPrompt", 17, hm6.subauth_regi_recentlyviewed_prompt);
    public static final RegiInterface RegiFollow = new RegiInterface("RegiFollow", 18, hm6.subauth_regi_follow);
    public static final RegiInterface AudioRegiOnboarding = new RegiInterface("AudioRegiOnboarding", 19, hm6.subauth_audio_regi_onboarding);
    public static final RegiInterface AudioRegiFollowing = new RegiInterface("AudioRegiFollowing", 20, hm6.subauth_audio_regi_following);
    public static final RegiInterface AudioRegiQueue = new RegiInterface("AudioRegiQueue", 21, hm6.subauth_audio_regi_queue);
    public static final RegiInterface AudioRegiSettings = new RegiInterface("AudioRegiSettings", 22, hm6.subauth_audio_regi_settings);
    public static final RegiInterface GamesRegiWelcome = new RegiInterface("GamesRegiWelcome", 23, hm6.subauth_games_regi_welcome);
    public static final RegiInterface GamesRegiArchive = new RegiInterface("GamesRegiArchive", 24, hm6.subauth_games_regi_archive);
    public static final RegiInterface GamesRegiLeaderboard = new RegiInterface("GamesRegiLeaderboard", 25, hm6.subauth_games_regi_leaderboard);
    public static final RegiInterface GamesRegiSettings = new RegiInterface("GamesRegiSettings", 26, hm6.subauth_games_regi_settings);
    public static final RegiInterface GamesRegiExpansionGame = new RegiInterface("GamesRegiExpansionGame", 27, hm6.subauth_games_regi_expansion_game);
    public static final RegiInterface GamesRegiDefault = new RegiInterface("GamesRegiDefault", 28, hm6.subauth_games_regi_default);

    private static final /* synthetic */ RegiInterface[] $values() {
        return new RegiInterface[]{LinkGateway, LinkMeter, LinkWelcome, LinkOverflow, LinkAd, LinkDlSubscribe, RegiOverflow, RegiGrowl, RegiSaveSection, RegiSavePrompt, RegiGateway, RegiMeter, RegiSettings, RegiWelcome, RegiComments, RegiCooking, RegiForcedLogout, RegiRecentPrompt, RegiFollow, AudioRegiOnboarding, AudioRegiFollowing, AudioRegiQueue, AudioRegiSettings, GamesRegiWelcome, GamesRegiArchive, GamesRegiLeaderboard, GamesRegiSettings, GamesRegiExpansionGame, GamesRegiDefault};
    }

    static {
        RegiInterface[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private RegiInterface(String str, int i, int i2) {
        this.resourceId = i2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static RegiInterface valueOf(String str) {
        return (RegiInterface) Enum.valueOf(RegiInterface.class, str);
    }

    public static RegiInterface[] values() {
        return (RegiInterface[]) $VALUES.clone();
    }

    public final String toString(Resources resources) {
        if (resources == null) {
            return null;
        }
        return resources.getString(hm6.subauth_regi_info_prefix) + resources.getString(this.resourceId);
    }
}
