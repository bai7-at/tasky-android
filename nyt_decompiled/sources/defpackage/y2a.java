package defpackage;

import com.google.android.gms.internal.ads.zzagc;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzagr;
import com.google.android.gms.internal.ads.zzagt;
import com.google.android.gms.internal.ads.zzagz;
import com.google.android.gms.internal.ads.zzbx;
import com.google.android.gms.internal.ads.zzgaa;

/* loaded from: classes3.dex */
abstract class y2a {
    static final String[] a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static zzbx a(b9e b9eVar) {
        String str;
        int s = b9eVar.s() + b9eVar.v();
        int v = b9eVar.v();
        int i = (v >> 24) & 255;
        zzbx zzbxVar = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = v & 16777215;
                if (i2 == 6516084) {
                    int v2 = b9eVar.v();
                    if (b9eVar.v() == 1684108385) {
                        b9eVar.l(8);
                        String O = b9eVar.O(v2 - 16);
                        zzbxVar = new zzagk("und", O, O);
                    } else {
                        ezd.f("MetadataUtil", "Failed to parse comment attribute: ".concat(c2a.b(v)));
                    }
                } else {
                    if (i2 != 7233901 && i2 != 7631467) {
                        if (i2 != 6516589 && i2 != 7828084) {
                            if (i2 == 6578553) {
                                zzbxVar = e(v, "TDRC", b9eVar);
                            } else if (i2 == 4280916) {
                                zzbxVar = e(v, "TPE1", b9eVar);
                            } else if (i2 == 7630703) {
                                zzbxVar = e(v, "TSSE", b9eVar);
                            } else if (i2 == 6384738) {
                                zzbxVar = e(v, "TALB", b9eVar);
                            } else if (i2 == 7108978) {
                                zzbxVar = e(v, "USLT", b9eVar);
                            } else if (i2 == 6776174) {
                                zzbxVar = e(v, "TCON", b9eVar);
                            } else {
                                if (i2 == 6779504) {
                                    zzbxVar = e(v, "TIT1", b9eVar);
                                }
                                ezd.b("MetadataUtil", "Skipped unknown metadata entry: " + c2a.b(v));
                            }
                        }
                        zzbxVar = e(v, "TCOM", b9eVar);
                    }
                    zzbxVar = e(v, "TIT2", b9eVar);
                }
            } else if (v == 1735291493) {
                int b = b(b9eVar);
                String str2 = (b <= 0 || b > 192) ? null : a[b - 1];
                if (str2 != null) {
                    zzbxVar = new zzagz("TCON", null, zzgaa.u(str2));
                } else {
                    ezd.f("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (v == 1684632427) {
                zzbxVar = d(1684632427, "TPOS", b9eVar);
            } else if (v == 1953655662) {
                zzbxVar = d(1953655662, "TRCK", b9eVar);
            } else if (v == 1953329263) {
                zzbxVar = c(1953329263, "TBPM", b9eVar, true, false);
            } else if (v == 1668311404) {
                zzbxVar = c(1668311404, "TCMP", b9eVar, true, true);
            } else if (v == 1668249202) {
                int v3 = b9eVar.v();
                if (b9eVar.v() == 1684108385) {
                    int v4 = b9eVar.v() & 16777215;
                    if (v4 == 13) {
                        str = "image/jpeg";
                    } else if (v4 == 14) {
                        str = "image/png";
                        v4 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        ezd.f("MetadataUtil", "Unrecognized cover art flags: " + v4);
                    } else {
                        b9eVar.l(4);
                        int i3 = v3 - 16;
                        byte[] bArr = new byte[i3];
                        b9eVar.g(bArr, 0, i3);
                        zzbxVar = new zzagc(str, null, 3, bArr);
                    }
                } else {
                    ezd.f("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (v == 1631670868) {
                zzbxVar = e(1631670868, "TPE2", b9eVar);
            } else if (v == 1936682605) {
                zzbxVar = e(1936682605, "TSOT", b9eVar);
            } else if (v == 1936679276) {
                zzbxVar = e(1936679276, "TSO2", b9eVar);
            } else if (v == 1936679282) {
                zzbxVar = e(1936679282, "TSOA", b9eVar);
            } else if (v == 1936679265) {
                zzbxVar = e(1936679265, "TSOP", b9eVar);
            } else if (v == 1936679791) {
                zzbxVar = e(1936679791, "TSOC", b9eVar);
            } else if (v == 1920233063) {
                zzbxVar = c(1920233063, "ITUNESADVISORY", b9eVar, false, false);
            } else if (v == 1885823344) {
                zzbxVar = c(1885823344, "ITUNESGAPLESS", b9eVar, false, true);
            } else if (v == 1936683886) {
                zzbxVar = e(1936683886, "TVSHOWSORT", b9eVar);
            } else if (v == 1953919848) {
                zzbxVar = e(1953919848, "TVSHOW", b9eVar);
            } else {
                if (v == 757935405) {
                    int i4 = -1;
                    int i5 = -1;
                    String str3 = null;
                    String str4 = null;
                    while (b9eVar.s() < s) {
                        int s2 = b9eVar.s();
                        int v5 = b9eVar.v();
                        int v6 = b9eVar.v();
                        b9eVar.l(4);
                        if (v6 == 1835360622) {
                            str3 = b9eVar.O(v5 - 12);
                        } else {
                            int i6 = v5 - 12;
                            if (v6 == 1851878757) {
                                str4 = b9eVar.O(i6);
                            } else {
                                if (v6 == 1684108385) {
                                    i5 = v5;
                                }
                                if (v6 == 1684108385) {
                                    i4 = s2;
                                }
                                b9eVar.l(i6);
                            }
                        }
                    }
                    if (str3 != null && str4 != null && i4 != -1) {
                        b9eVar.k(i4);
                        b9eVar.l(16);
                        zzbxVar = new zzagt(str3, str4, b9eVar.O(i5 - 16));
                    }
                }
                ezd.b("MetadataUtil", "Skipped unknown metadata entry: " + c2a.b(v));
            }
            return zzbxVar;
        } finally {
            b9eVar.k(s);
        }
    }

    private static int b(b9e b9eVar) {
        b9eVar.l(4);
        if (b9eVar.v() == 1684108385) {
            b9eVar.l(8);
            return b9eVar.B();
        }
        ezd.f("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static zzagr c(int i, String str, b9e b9eVar, boolean z, boolean z2) {
        int b = b(b9eVar);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b >= 0) {
            return z ? new zzagz(str, null, zzgaa.u(Integer.toString(b))) : new zzagk("und", str, Integer.toString(b));
        }
        ezd.f("MetadataUtil", "Failed to parse uint8 attribute: ".concat(c2a.b(i)));
        return null;
    }

    private static zzagz d(int i, String str, b9e b9eVar) {
        int v = b9eVar.v();
        if (b9eVar.v() == 1684108385 && v >= 22) {
            b9eVar.l(10);
            int F = b9eVar.F();
            if (F > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(F);
                String sb2 = sb.toString();
                int F2 = b9eVar.F();
                if (F2 > 0) {
                    sb2 = sb2 + "/" + F2;
                }
                return new zzagz(str, null, zzgaa.u(sb2));
            }
        }
        ezd.f("MetadataUtil", "Failed to parse index/count attribute: ".concat(c2a.b(i)));
        return null;
    }

    private static zzagz e(int i, String str, b9e b9eVar) {
        int v = b9eVar.v();
        if (b9eVar.v() == 1684108385) {
            b9eVar.l(8);
            return new zzagz(str, null, zzgaa.u(b9eVar.O(v - 16)));
        }
        ezd.f("MetadataUtil", "Failed to parse text attribute: ".concat(c2a.b(i)));
        return null;
    }
}
