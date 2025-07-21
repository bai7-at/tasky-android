package defpackage;

import com.nytimes.android.features.games.gameshub.configuration.models.PlayTabContentDetails;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.ribbon.destinations.games.GamesConfigItem;
import com.nytimes.android.ribbon.destinations.games.GamesDestinationItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class vu2 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PlayTabContentDetails.values().length];
            try {
                iArr[PlayTabContentDetails.SPELLING_BEE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayTabContentDetails.STRANDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayTabContentDetails.CROSSWORD_DAILY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayTabContentDetails.CROSSWORD_MINI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlayTabContentDetails.WORDLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PlayTabContentDetails.CONNECTIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PlayTabContentDetails.LETTER_BOXED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PlayTabContentDetails.TILES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PlayTabContentDetails.SUDOKU.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            a = iArr;
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return tp0.d(Integer.valueOf(((GamesDestinationItem) obj).e()), Integer.valueOf(((GamesDestinationItem) obj2).e()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list) {
        GamesDestinationItem gamesDestinationItem;
        try {
            List<GamesConfigItem> list2 = list;
            ArrayList arrayList = new ArrayList(i.w(list2, 10));
            for (GamesConfigItem gamesConfigItem : list2) {
                PlayTabContentDetails b2 = PlayTabContentDetails.Companion.b(gamesConfigItem.b());
                switch (b2 == null ? -1 : a.a[b2.ordinal()]) {
                    case 1:
                        gamesDestinationItem = new GamesDestinationItem(gamesConfigItem.b(), gamesConfigItem.c(), PlayTabContentDetails.SPELLING_BEE.getTitle(), gamesConfigItem.a(), me6.progress_spelling_bee_default, gamesConfigItem.d());
                        break;
                    case 2:
                        gamesDestinationItem = new GamesDestinationItem(gamesConfigItem.b(), gamesConfigItem.c(), PlayTabContentDetails.STRANDS.getTitle(), gamesConfigItem.a(), me6.progress_strands_default, gamesConfigItem.d());
                        break;
                    case 3:
                        gamesDestinationItem = new GamesDestinationItem(gamesConfigItem.b(), gamesConfigItem.c(), PlayTabContentDetails.CROSSWORD_DAILY.getTitle(), gamesConfigItem.a(), me6.progress_crossword_default, gamesConfigItem.d());
                        break;
                    case 4:
                        gamesDestinationItem = new GamesDestinationItem(gamesConfigItem.b(), gamesConfigItem.c(), PlayTabContentDetails.CROSSWORD_MINI.getTitle(), gamesConfigItem.a(), me6.progress_mini_default, gamesConfigItem.d());
                        break;
                    case 5:
                        gamesDestinationItem = new GamesDestinationItem(gamesConfigItem.b(), gamesConfigItem.c(), PlayTabContentDetails.WORDLE.getTitle(), gamesConfigItem.a(), me6.progress_wordle_default, gamesConfigItem.d());
                        break;
                    case 6:
                        gamesDestinationItem = new GamesDestinationItem(gamesConfigItem.b(), gamesConfigItem.c(), PlayTabContentDetails.CONNECTIONS.getTitle(), gamesConfigItem.a(), me6.progress_connections_default, gamesConfigItem.d());
                        break;
                    case 7:
                        gamesDestinationItem = new GamesDestinationItem(gamesConfigItem.b(), gamesConfigItem.c(), PlayTabContentDetails.LETTER_BOXED.getTitle(), gamesConfigItem.a(), me6.progress_letter_boxed_default, gamesConfigItem.d());
                        break;
                    case 8:
                        gamesDestinationItem = new GamesDestinationItem(gamesConfigItem.b(), gamesConfigItem.c(), PlayTabContentDetails.TILES.getTitle(), gamesConfigItem.a(), me6.progress_tiles_default, gamesConfigItem.d());
                        break;
                    case 9:
                        gamesDestinationItem = new GamesDestinationItem(gamesConfigItem.b(), gamesConfigItem.c(), PlayTabContentDetails.SUDOKU.getTitle(), gamesConfigItem.a(), me6.progress_sudoku_default, gamesConfigItem.d());
                        break;
                    default:
                        throw new EnumConstantNotPresentException(PlayTabContentDetails.class, gamesConfigItem.b());
                }
                arrayList.add(gamesDestinationItem);
            }
            return i.N0(arrayList, new b());
        } catch (Exception e) {
            NYTLogger.h(e);
            return i.l();
        }
    }
}
