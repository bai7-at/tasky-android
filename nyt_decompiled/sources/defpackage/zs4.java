package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.t0;
import com.google.common.collect.ImmutableList;

/* loaded from: classes2.dex */
abstract class zs4 {
    static final String[] a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static CommentFrame a(int i, yo5 yo5Var) {
        int q = yo5Var.q();
        if (yo5Var.q() == 1684108385) {
            yo5Var.V(8);
            String C = yo5Var.C(q - 16);
            return new CommentFrame("und", C, C);
        }
        a84.j("MetadataUtil", "Failed to parse comment attribute: " + yu.a(i));
        return null;
    }

    private static ApicFrame b(yo5 yo5Var) {
        int q = yo5Var.q();
        if (yo5Var.q() != 1684108385) {
            a84.j("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int b = yu.b(yo5Var.q());
        String str = b == 13 ? "image/jpeg" : b == 14 ? "image/png" : null;
        if (str == null) {
            a84.j("MetadataUtil", "Unrecognized cover art flags: " + b);
            return null;
        }
        yo5Var.V(4);
        int i = q - 16;
        byte[] bArr = new byte[i];
        yo5Var.l(bArr, 0, i);
        return new ApicFrame(str, null, 3, bArr);
    }

    public static Metadata.Entry c(yo5 yo5Var) {
        int f = yo5Var.f() + yo5Var.q();
        int q = yo5Var.q();
        int i = (q >> 24) & 255;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & q;
                if (i2 == 6516084) {
                    return a(q, yo5Var);
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    return h(q, "TIT2", yo5Var);
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    return h(q, "TCOM", yo5Var);
                }
                if (i2 == 6578553) {
                    return h(q, "TDRC", yo5Var);
                }
                if (i2 == 4280916) {
                    return h(q, "TPE1", yo5Var);
                }
                if (i2 == 7630703) {
                    return h(q, "TSSE", yo5Var);
                }
                if (i2 == 6384738) {
                    return h(q, "TALB", yo5Var);
                }
                if (i2 == 7108978) {
                    return h(q, "USLT", yo5Var);
                }
                if (i2 == 6776174) {
                    return h(q, "TCON", yo5Var);
                }
                if (i2 == 6779504) {
                    return h(q, "TIT1", yo5Var);
                }
            } else {
                if (q == 1735291493) {
                    return g(yo5Var);
                }
                if (q == 1684632427) {
                    return d(q, "TPOS", yo5Var);
                }
                if (q == 1953655662) {
                    return d(q, "TRCK", yo5Var);
                }
                if (q == 1953329263) {
                    return i(q, "TBPM", yo5Var, true, false);
                }
                if (q == 1668311404) {
                    return i(q, "TCMP", yo5Var, true, true);
                }
                if (q == 1668249202) {
                    return b(yo5Var);
                }
                if (q == 1631670868) {
                    return h(q, "TPE2", yo5Var);
                }
                if (q == 1936682605) {
                    return h(q, "TSOT", yo5Var);
                }
                if (q == 1936679276) {
                    return h(q, "TSO2", yo5Var);
                }
                if (q == 1936679282) {
                    return h(q, "TSOA", yo5Var);
                }
                if (q == 1936679265) {
                    return h(q, "TSOP", yo5Var);
                }
                if (q == 1936679791) {
                    return h(q, "TSOC", yo5Var);
                }
                if (q == 1920233063) {
                    return i(q, "ITUNESADVISORY", yo5Var, false, false);
                }
                if (q == 1885823344) {
                    return i(q, "ITUNESGAPLESS", yo5Var, false, true);
                }
                if (q == 1936683886) {
                    return h(q, "TVSHOWSORT", yo5Var);
                }
                if (q == 1953919848) {
                    return h(q, "TVSHOW", yo5Var);
                }
                if (q == 757935405) {
                    return e(yo5Var, f);
                }
            }
            a84.b("MetadataUtil", "Skipped unknown metadata entry: " + yu.a(q));
            yo5Var.U(f);
            return null;
        } finally {
            yo5Var.U(f);
        }
    }

    private static TextInformationFrame d(int i, String str, yo5 yo5Var) {
        int q = yo5Var.q();
        if (yo5Var.q() == 1684108385 && q >= 22) {
            yo5Var.V(10);
            int N = yo5Var.N();
            if (N > 0) {
                String str2 = "" + N;
                int N2 = yo5Var.N();
                if (N2 > 0) {
                    str2 = str2 + "/" + N2;
                }
                return new TextInformationFrame(str, null, ImmutableList.y(str2));
            }
        }
        a84.j("MetadataUtil", "Failed to parse index/count attribute: " + yu.a(i));
        return null;
    }

    private static Id3Frame e(yo5 yo5Var, int i) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (yo5Var.f() < i) {
            int f = yo5Var.f();
            int q = yo5Var.q();
            int q2 = yo5Var.q();
            yo5Var.V(4);
            if (q2 == 1835360622) {
                str = yo5Var.C(q - 12);
            } else if (q2 == 1851878757) {
                str2 = yo5Var.C(q - 12);
            } else {
                if (q2 == 1684108385) {
                    i2 = f;
                    i3 = q;
                }
                yo5Var.V(q - 12);
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        yo5Var.U(i2);
        yo5Var.V(16);
        return new InternalFrame(str, str2, yo5Var.C(i3 - 16));
    }

    public static MdtaMetadataEntry f(yo5 yo5Var, int i, String str) {
        while (true) {
            int f = yo5Var.f();
            if (f >= i) {
                return null;
            }
            int q = yo5Var.q();
            if (yo5Var.q() == 1684108385) {
                int q2 = yo5Var.q();
                int q3 = yo5Var.q();
                int i2 = q - 16;
                byte[] bArr = new byte[i2];
                yo5Var.l(bArr, 0, i2);
                return new MdtaMetadataEntry(str, bArr, q3, q2);
            }
            yo5Var.U(f + q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.exoplayer2.metadata.id3.TextInformationFrame g(defpackage.yo5 r3) {
        /*
            int r3 = j(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = defpackage.zs4.a
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L20
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame
            java.lang.String r2 = "TCON"
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.y(r3)
            r1.<init>(r2, r0, r3)
            return r1
        L20:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            defpackage.a84.j(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs4.g(yo5):com.google.android.exoplayer2.metadata.id3.TextInformationFrame");
    }

    private static TextInformationFrame h(int i, String str, yo5 yo5Var) {
        int q = yo5Var.q();
        if (yo5Var.q() == 1684108385) {
            yo5Var.V(8);
            return new TextInformationFrame(str, null, ImmutableList.y(yo5Var.C(q - 16)));
        }
        a84.j("MetadataUtil", "Failed to parse text attribute: " + yu.a(i));
        return null;
    }

    private static Id3Frame i(int i, String str, yo5 yo5Var, boolean z, boolean z2) {
        int j = j(yo5Var);
        if (z2) {
            j = Math.min(1, j);
        }
        if (j >= 0) {
            return z ? new TextInformationFrame(str, null, ImmutableList.y(Integer.toString(j))) : new CommentFrame("und", str, Integer.toString(j));
        }
        a84.j("MetadataUtil", "Failed to parse uint8 attribute: " + yu.a(i));
        return null;
    }

    private static int j(yo5 yo5Var) {
        yo5Var.V(4);
        if (yo5Var.q() == 1684108385) {
            yo5Var.V(8);
            return yo5Var.H();
        }
        a84.j("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int i, bw2 bw2Var, t0.b bVar) {
        if (i == 1 && bw2Var.a()) {
            bVar.P(bw2Var.a).Q(bw2Var.b);
        }
    }

    public static void l(int i, Metadata metadata, Metadata metadata2, t0.b bVar, Metadata... metadataArr) {
        Metadata metadata3 = new Metadata(new Metadata.Entry[0]);
        if (i != 1 || metadata == null) {
            metadata = metadata3;
        }
        if (metadata2 != null) {
            for (int i2 = 0; i2 < metadata2.e(); i2++) {
                Metadata.Entry d = metadata2.d(i2);
                if (d instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) d;
                    if (!mdtaMetadataEntry.key.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS)) {
                        metadata = metadata.a(mdtaMetadataEntry);
                    } else if (i == 2) {
                        metadata = metadata.a(mdtaMetadataEntry);
                    }
                }
            }
        }
        for (Metadata metadata4 : metadataArr) {
            metadata = metadata.b(metadata4);
        }
        if (metadata.e() > 0) {
            bVar.Z(metadata);
        }
    }
}
