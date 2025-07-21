package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.util.Xml;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.appsflyer.oaid.BuildConfig;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import com.comscore.android.util.AndroidTcfDataLoader;
import com.comscore.streaming.ContentFeedType;
import com.comscore.streaming.EventType;
import com.comscore.streaming.WindowState;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.nytimes.android.comments.comments.mvi.ViewingCommentsActivityKt;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
class SVGParser {
    private int d;
    private SVG a = null;
    private SVG.h0 b = null;
    private boolean c = false;
    private boolean e = false;
    private SVGElem f = null;
    private StringBuilder g = null;
    private boolean h = false;
    private StringBuilder i = null;

    private enum SVGAttr {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;

        private static final Map<String, SVGAttr> cache = new HashMap();

        static {
            for (SVGAttr sVGAttr : values()) {
                if (sVGAttr == CLASS) {
                    cache.put("class", sVGAttr);
                } else if (sVGAttr != UNSUPPORTED) {
                    cache.put(sVGAttr.name().replace('_', '-'), sVGAttr);
                }
            }
        }

        public static SVGAttr fromString(String str) {
            SVGAttr sVGAttr = cache.get(str);
            return sVGAttr != null ? sVGAttr : UNSUPPORTED;
        }
    }

    private enum SVGElem {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;

        private static final Map<String, SVGElem> cache = new HashMap();

        static {
            for (SVGElem sVGElem : values()) {
                if (sVGElem == SWITCH) {
                    cache.put("switch", sVGElem);
                } else if (sVGElem != UNSUPPORTED) {
                    cache.put(sVGElem.name(), sVGElem);
                }
            }
        }

        public static SVGElem fromString(String str) {
            SVGElem sVGElem = cache.get(str);
            return sVGElem != null ? sVGElem : UNSUPPORTED;
        }
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[SVGAttr.values().length];
            b = iArr;
            try {
                iArr[SVGAttr.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[SVGAttr.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[SVGAttr.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[SVGAttr.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[SVGAttr.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[SVGAttr.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[SVGAttr.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[SVGAttr.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[SVGAttr.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[SVGAttr.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[SVGAttr.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[SVGAttr.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[SVGAttr.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[SVGAttr.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[SVGAttr.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[SVGAttr.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[SVGAttr.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[SVGAttr.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                b[SVGAttr.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                b[SVGAttr.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                b[SVGAttr.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                b[SVGAttr.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                b[SVGAttr.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                b[SVGAttr.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                b[SVGAttr.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                b[SVGAttr.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                b[SVGAttr.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                b[SVGAttr.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                b[SVGAttr.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                b[SVGAttr.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                b[SVGAttr.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                b[SVGAttr.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                b[SVGAttr.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                b[SVGAttr.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                b[SVGAttr.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                b[SVGAttr.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                b[SVGAttr.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                b[SVGAttr.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                b[SVGAttr.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                b[SVGAttr.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                b[SVGAttr.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                b[SVGAttr.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                b[SVGAttr.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                b[SVGAttr.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                b[SVGAttr.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                b[SVGAttr.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                b[SVGAttr.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                b[SVGAttr.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                b[SVGAttr.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                b[SVGAttr.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                b[SVGAttr.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                b[SVGAttr.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                b[SVGAttr.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                b[SVGAttr.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                b[SVGAttr.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                b[SVGAttr.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                b[SVGAttr.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                b[SVGAttr.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                b[SVGAttr.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                b[SVGAttr.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                b[SVGAttr.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                b[SVGAttr.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                b[SVGAttr.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                b[SVGAttr.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                b[SVGAttr.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                b[SVGAttr.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                b[SVGAttr.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                b[SVGAttr.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                b[SVGAttr.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                b[SVGAttr.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                b[SVGAttr.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                b[SVGAttr.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                b[SVGAttr.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                b[SVGAttr.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                b[SVGAttr.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                b[SVGAttr.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                b[SVGAttr.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                b[SVGAttr.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                b[SVGAttr.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                b[SVGAttr.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                b[SVGAttr.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                b[SVGAttr.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                b[SVGAttr.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                b[SVGAttr.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                b[SVGAttr.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                b[SVGAttr.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                b[SVGAttr.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                b[SVGAttr.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                b[SVGAttr.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[SVGElem.values().length];
            a = iArr2;
            try {
                iArr2[SVGElem.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                a[SVGElem.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                a[SVGElem.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                a[SVGElem.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                a[SVGElem.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                a[SVGElem.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                a[SVGElem.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                a[SVGElem.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                a[SVGElem.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                a[SVGElem.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                a[SVGElem.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                a[SVGElem.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                a[SVGElem.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                a[SVGElem.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                a[SVGElem.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                a[SVGElem.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                a[SVGElem.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                a[SVGElem.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                a[SVGElem.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                a[SVGElem.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                a[SVGElem.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                a[SVGElem.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                a[SVGElem.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                a[SVGElem.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                a[SVGElem.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                a[SVGElem.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                a[SVGElem.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                a[SVGElem.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                a[SVGElem.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                a[SVGElem.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                a[SVGElem.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    private static class b {
        private static final Map a;

        static {
            HashMap hashMap = new HashMap(10);
            a = hashMap;
            hashMap.put("none", PreserveAspectRatio.Alignment.none);
            hashMap.put("xMinYMin", PreserveAspectRatio.Alignment.xMinYMin);
            hashMap.put("xMidYMin", PreserveAspectRatio.Alignment.xMidYMin);
            hashMap.put("xMaxYMin", PreserveAspectRatio.Alignment.xMaxYMin);
            hashMap.put("xMinYMid", PreserveAspectRatio.Alignment.xMinYMid);
            hashMap.put("xMidYMid", PreserveAspectRatio.Alignment.xMidYMid);
            hashMap.put("xMaxYMid", PreserveAspectRatio.Alignment.xMaxYMid);
            hashMap.put("xMinYMax", PreserveAspectRatio.Alignment.xMinYMax);
            hashMap.put("xMidYMax", PreserveAspectRatio.Alignment.xMidYMax);
            hashMap.put("xMaxYMax", PreserveAspectRatio.Alignment.xMaxYMax);
        }

        static PreserveAspectRatio.Alignment a(String str) {
            return (PreserveAspectRatio.Alignment) a.get(str);
        }
    }

    private static class c {
        private static final Map a;

        static {
            HashMap hashMap = new HashMap(47);
            a = hashMap;
            hashMap.put("aliceblue", -984833);
            hashMap.put("antiquewhite", -332841);
            hashMap.put("aqua", -16711681);
            hashMap.put("aquamarine", -8388652);
            hashMap.put("azure", -983041);
            hashMap.put("beige", -657956);
            hashMap.put("bisque", -6972);
            hashMap.put("black", -16777216);
            hashMap.put("blanchedalmond", -5171);
            hashMap.put("blue", -16776961);
            hashMap.put("blueviolet", -7722014);
            hashMap.put("brown", -5952982);
            hashMap.put("burlywood", -2180985);
            hashMap.put("cadetblue", -10510688);
            hashMap.put("chartreuse", -8388864);
            hashMap.put("chocolate", -2987746);
            hashMap.put("coral", -32944);
            hashMap.put("cornflowerblue", -10185235);
            hashMap.put("cornsilk", -1828);
            hashMap.put("crimson", -2354116);
            hashMap.put("cyan", -16711681);
            hashMap.put("darkblue", -16777077);
            hashMap.put("darkcyan", -16741493);
            hashMap.put("darkgoldenrod", -4684277);
            hashMap.put("darkgray", -5658199);
            hashMap.put("darkgreen", -16751616);
            hashMap.put("darkgrey", -5658199);
            hashMap.put("darkkhaki", -4343957);
            hashMap.put("darkmagenta", -7667573);
            hashMap.put("darkolivegreen", -11179217);
            hashMap.put("darkorange", -29696);
            hashMap.put("darkorchid", -6737204);
            hashMap.put("darkred", -7667712);
            hashMap.put("darksalmon", -1468806);
            hashMap.put("darkseagreen", -7357297);
            hashMap.put("darkslateblue", -12042869);
            hashMap.put("darkslategray", -13676721);
            hashMap.put("darkslategrey", -13676721);
            hashMap.put("darkturquoise", -16724271);
            hashMap.put("darkviolet", -7077677);
            hashMap.put("deeppink", -60269);
            hashMap.put("deepskyblue", -16728065);
            hashMap.put("dimgray", -9868951);
            hashMap.put("dimgrey", -9868951);
            hashMap.put("dodgerblue", -14774017);
            hashMap.put("firebrick", -5103070);
            hashMap.put("floralwhite", -1296);
            hashMap.put("forestgreen", -14513374);
            hashMap.put("fuchsia", -65281);
            hashMap.put("gainsboro", -2302756);
            hashMap.put("ghostwhite", -460545);
            hashMap.put("gold", -10496);
            hashMap.put("goldenrod", -2448096);
            hashMap.put("gray", -8355712);
            hashMap.put("green", -16744448);
            hashMap.put("greenyellow", -5374161);
            hashMap.put("grey", -8355712);
            hashMap.put("honeydew", -983056);
            hashMap.put("hotpink", -38476);
            hashMap.put("indianred", -3318692);
            hashMap.put("indigo", -11861886);
            hashMap.put("ivory", -16);
            hashMap.put("khaki", -989556);
            hashMap.put("lavender", -1644806);
            hashMap.put("lavenderblush", -3851);
            hashMap.put("lawngreen", -8586240);
            hashMap.put("lemonchiffon", -1331);
            hashMap.put("lightblue", -5383962);
            hashMap.put("lightcoral", -1015680);
            hashMap.put("lightcyan", -2031617);
            hashMap.put("lightgoldenrodyellow", -329006);
            hashMap.put("lightgray", -2894893);
            hashMap.put("lightgreen", -7278960);
            hashMap.put("lightgrey", -2894893);
            hashMap.put("lightpink", -18751);
            hashMap.put("lightsalmon", -24454);
            hashMap.put("lightseagreen", -14634326);
            hashMap.put("lightskyblue", -7876870);
            hashMap.put("lightslategray", -8943463);
            hashMap.put("lightslategrey", -8943463);
            hashMap.put("lightsteelblue", -5192482);
            hashMap.put("lightyellow", -32);
            hashMap.put("lime", -16711936);
            hashMap.put("limegreen", -13447886);
            hashMap.put("linen", -331546);
            hashMap.put("magenta", -65281);
            hashMap.put("maroon", -8388608);
            hashMap.put("mediumaquamarine", -10039894);
            hashMap.put("mediumblue", -16777011);
            hashMap.put("mediumorchid", -4565549);
            hashMap.put("mediumpurple", -7114533);
            hashMap.put("mediumseagreen", -12799119);
            hashMap.put("mediumslateblue", -8689426);
            hashMap.put("mediumspringgreen", -16713062);
            hashMap.put("mediumturquoise", -12004916);
            hashMap.put("mediumvioletred", -3730043);
            hashMap.put("midnightblue", -15132304);
            hashMap.put("mintcream", -655366);
            hashMap.put("mistyrose", -6943);
            hashMap.put("moccasin", -6987);
            hashMap.put("navajowhite", -8531);
            hashMap.put("navy", -16777088);
            hashMap.put("oldlace", -133658);
            hashMap.put("olive", -8355840);
            hashMap.put("olivedrab", -9728477);
            hashMap.put("orange", -23296);
            hashMap.put("orangered", -47872);
            hashMap.put("orchid", -2461482);
            hashMap.put("palegoldenrod", -1120086);
            hashMap.put("palegreen", -6751336);
            hashMap.put("paleturquoise", -5247250);
            hashMap.put("palevioletred", -2396013);
            hashMap.put("papayawhip", -4139);
            hashMap.put("peachpuff", -9543);
            hashMap.put("peru", -3308225);
            hashMap.put("pink", -16181);
            hashMap.put("plum", -2252579);
            hashMap.put("powderblue", -5185306);
            hashMap.put("purple", -8388480);
            hashMap.put("rebeccapurple", -10079335);
            hashMap.put("red", -65536);
            hashMap.put("rosybrown", -4419697);
            hashMap.put("royalblue", -12490271);
            hashMap.put("saddlebrown", -7650029);
            hashMap.put("salmon", -360334);
            hashMap.put("sandybrown", -744352);
            hashMap.put("seagreen", -13726889);
            hashMap.put("seashell", -2578);
            hashMap.put("sienna", -6270419);
            hashMap.put("silver", -4144960);
            hashMap.put("skyblue", -7876885);
            hashMap.put("slateblue", -9807155);
            hashMap.put("slategray", -9404272);
            hashMap.put("slategrey", -9404272);
            hashMap.put("snow", -1286);
            hashMap.put("springgreen", -16711809);
            hashMap.put("steelblue", -12156236);
            hashMap.put("tan", -2968436);
            hashMap.put("teal", -16744320);
            hashMap.put("thistle", -2572328);
            hashMap.put("tomato", -40121);
            hashMap.put("turquoise", -12525360);
            hashMap.put("violet", -1146130);
            hashMap.put("wheat", -663885);
            hashMap.put("white", -1);
            hashMap.put("whitesmoke", -657931);
            hashMap.put("yellow", -256);
            hashMap.put("yellowgreen", -6632142);
            hashMap.put("transparent", 0);
        }

        static Integer a(String str) {
            return (Integer) a.get(str);
        }
    }

    private static class d {
        private static final Map a;

        static {
            HashMap hashMap = new HashMap(9);
            a = hashMap;
            SVG.Unit unit = SVG.Unit.pt;
            hashMap.put("xx-small", new SVG.o(0.694f, unit));
            hashMap.put("x-small", new SVG.o(0.833f, unit));
            hashMap.put("small", new SVG.o(10.0f, unit));
            hashMap.put("medium", new SVG.o(12.0f, unit));
            hashMap.put("large", new SVG.o(14.4f, unit));
            hashMap.put("x-large", new SVG.o(17.3f, unit));
            hashMap.put("xx-large", new SVG.o(20.7f, unit));
            SVG.Unit unit2 = SVG.Unit.percent;
            hashMap.put("smaller", new SVG.o(83.33f, unit2));
            hashMap.put("larger", new SVG.o(120.0f, unit2));
        }

        static SVG.o a(String str) {
            return (SVG.o) a.get(str);
        }
    }

    private static class e {
        private static final Map a;

        static {
            HashMap hashMap = new HashMap(13);
            a = hashMap;
            Integer valueOf = Integer.valueOf(WindowState.NORMAL);
            hashMap.put("normal", valueOf);
            Integer valueOf2 = Integer.valueOf(ViewingCommentsActivityKt.ANIMATION_TRANSITION_DURATION_MILLIS);
            hashMap.put("bold", valueOf2);
            hashMap.put("bolder", 1);
            hashMap.put("lighter", -1);
            hashMap.put("100", 100);
            hashMap.put("200", 200);
            hashMap.put("300", Integer.valueOf(ContentFeedType.OTHER));
            hashMap.put("400", valueOf);
            hashMap.put("500", 500);
            hashMap.put("600", 600);
            hashMap.put("700", valueOf2);
            hashMap.put("800", 800);
            hashMap.put("900", Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS));
        }

        static Integer a(String str) {
            return (Integer) a.get(str);
        }
    }

    private class f extends DefaultHandler2 {
        private f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) {
            SVGParser.this.c1(new String(cArr, i, i2));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            SVGParser.this.o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            SVGParser.this.p(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            SVGParser.this.r(str, SVGParser.this.x0(new g(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            SVGParser.this.W0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            SVGParser.this.X0(str, str2, str3, attributes);
        }

        /* synthetic */ f(SVGParser sVGParser, a aVar) {
            this();
        }
    }

    static class g {
        String a;
        int c;
        int b = 0;
        private com.caverock.androidsvg.b d = new com.caverock.androidsvg.b();

        g(String str) {
            this.c = 0;
            String trim = str.trim();
            this.a = trim;
            this.c = trim.length();
        }

        void A() {
            while (true) {
                int i = this.b;
                if (i >= this.c || !k(this.a.charAt(i))) {
                    return;
                } else {
                    this.b++;
                }
            }
        }

        int a() {
            int i = this.b;
            int i2 = this.c;
            if (i == i2) {
                return -1;
            }
            int i3 = i + 1;
            this.b = i3;
            if (i3 < i2) {
                return this.a.charAt(i3);
            }
            return -1;
        }

        String b() {
            int i = this.b;
            while (!h() && !k(this.a.charAt(this.b))) {
                this.b++;
            }
            String substring = this.a.substring(i, this.b);
            this.b = i;
            return substring;
        }

        Boolean c(Object obj) {
            if (obj == null) {
                return null;
            }
            z();
            return m();
        }

        float d(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            z();
            return n();
        }

        float e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            z();
            return n();
        }

        boolean f(char c) {
            int i = this.b;
            boolean z = i < this.c && this.a.charAt(i) == c;
            if (z) {
                this.b++;
            }
            return z;
        }

        boolean g(String str) {
            int length = str.length();
            int i = this.b;
            boolean z = i <= this.c - length && this.a.substring(i, i + length).equals(str);
            if (z) {
                this.b += length;
            }
            return z;
        }

        boolean h() {
            return this.b == this.c;
        }

        boolean i() {
            int i = this.b;
            if (i == this.c) {
                return false;
            }
            char charAt = this.a.charAt(i);
            return (charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z');
        }

        boolean j(int i) {
            return i == 10 || i == 13;
        }

        boolean k(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        Integer l() {
            int i = this.b;
            if (i == this.c) {
                return null;
            }
            String str = this.a;
            this.b = i + 1;
            return Integer.valueOf(str.charAt(i));
        }

        Boolean m() {
            int i = this.b;
            if (i == this.c) {
                return null;
            }
            char charAt = this.a.charAt(i);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            this.b++;
            return Boolean.valueOf(charAt == '1');
        }

        float n() {
            float b = this.d.b(this.a, this.b, this.c);
            if (!Float.isNaN(b)) {
                this.b = this.d.a();
            }
            return b;
        }

        String o() {
            if (h()) {
                return null;
            }
            int i = this.b;
            int charAt = this.a.charAt(i);
            while (true) {
                if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                    break;
                }
                charAt = a();
            }
            int i2 = this.b;
            while (k(charAt)) {
                charAt = a();
            }
            if (charAt == 40) {
                this.b++;
                return this.a.substring(i, i2);
            }
            this.b = i;
            return null;
        }

        SVG.o p() {
            float n = n();
            if (Float.isNaN(n)) {
                return null;
            }
            SVG.Unit v = v();
            return v == null ? new SVG.o(n, SVG.Unit.px) : new SVG.o(n, v);
        }

        String q() {
            if (h()) {
                return null;
            }
            int i = this.b;
            char charAt = this.a.charAt(i);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            int a = a();
            while (a != -1 && a != charAt) {
                a = a();
            }
            if (a == -1) {
                this.b = i;
                return null;
            }
            int i2 = this.b;
            this.b = i2 + 1;
            return this.a.substring(i + 1, i2);
        }

        String r() {
            return t(' ', false);
        }

        String s(char c) {
            return t(c, false);
        }

        String t(char c, boolean z) {
            if (h()) {
                return null;
            }
            char charAt = this.a.charAt(this.b);
            if ((!z && k(charAt)) || charAt == c) {
                return null;
            }
            int i = this.b;
            int a = a();
            while (a != -1 && a != c && (z || !k(a))) {
                a = a();
            }
            return this.a.substring(i, this.b);
        }

        String u(char c) {
            return t(c, true);
        }

        SVG.Unit v() {
            if (h()) {
                return null;
            }
            if (this.a.charAt(this.b) == '%') {
                this.b++;
                return SVG.Unit.percent;
            }
            int i = this.b;
            if (i > this.c - 2) {
                return null;
            }
            try {
                SVG.Unit valueOf = SVG.Unit.valueOf(this.a.substring(i, i + 2).toLowerCase(Locale.US));
                this.b += 2;
                return valueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        String w() {
            if (h()) {
                return null;
            }
            int i = this.b;
            char charAt = this.a.charAt(i);
            if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                this.b = i;
                return null;
            }
            int a = a();
            while (true) {
                if ((a < 65 || a > 90) && (a < 97 || a > 122)) {
                    break;
                }
                a = a();
            }
            return this.a.substring(i, this.b);
        }

        float x() {
            z();
            float b = this.d.b(this.a, this.b, this.c);
            if (!Float.isNaN(b)) {
                this.b = this.d.a();
            }
            return b;
        }

        String y() {
            if (h()) {
                return null;
            }
            int i = this.b;
            this.b = this.c;
            return this.a.substring(i);
        }

        boolean z() {
            A();
            int i = this.b;
            if (i == this.c || this.a.charAt(i) != ',') {
                return false;
            }
            this.b++;
            A();
            return true;
        }
    }

    private class h implements Attributes {
        private XmlPullParser a;

        public h(XmlPullParser xmlPullParser) {
            this.a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i) {
            return this.a.getAttributeName(i);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i) {
            String attributeName = this.a.getAttributeName(i);
            if (this.a.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return this.a.getAttributePrefix(i) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i) {
            return this.a.getAttributeNamespace(i);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i) {
            return this.a.getAttributeValue(i);
        }
    }

    SVGParser() {
    }

    private void A(SVG.d dVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 12:
                    dVar.o = o0(trim);
                    break;
                case 13:
                    dVar.p = o0(trim);
                    break;
                case 14:
                    SVG.o o0 = o0(trim);
                    dVar.q = o0;
                    if (o0.g()) {
                        throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                    }
                    break;
            }
        }
    }

    private static Set A0(String str) {
        g gVar = new g(str);
        HashSet hashSet = new HashSet();
        while (!gVar.h()) {
            hashSet.add(gVar.r());
            gVar.A();
        }
        return hashSet;
    }

    private void B(SVG.e eVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(trim)) {
                    eVar.p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(trim)) {
                        throw new SVGParseException("Invalid value for attribute clipPathUnits");
                    }
                    eVar.p = Boolean.TRUE;
                }
            }
        }
    }

    private static SVG.o[] B0(String str) {
        SVG.o p;
        g gVar = new g(str);
        gVar.A();
        if (gVar.h() || (p = gVar.p()) == null || p.g()) {
            return null;
        }
        float a2 = p.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(p);
        while (!gVar.h()) {
            gVar.z();
            SVG.o p2 = gVar.p();
            if (p2 == null || p2.g()) {
                return null;
            }
            arrayList.add(p2);
            a2 += p2.a();
        }
        if (a2 == 0.0f) {
            return null;
        }
        return (SVG.o[]) arrayList.toArray(new SVG.o[arrayList.size()]);
    }

    private void C(SVG.e0 e0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 21:
                    e0Var.e(z0(trim));
                    break;
                case 22:
                    e0Var.i(trim);
                    break;
                case 23:
                    e0Var.f(F0(trim));
                    break;
                case 24:
                    e0Var.h(A0(trim));
                    break;
                case EventType.SUBS /* 25 */:
                    List i0 = i0(trim);
                    e0Var.c(i0 != null ? new HashSet(i0) : new HashSet(0));
                    break;
            }
        }
    }

    private static SVG.Style.LineCap C0(String str) {
        if ("butt".equals(str)) {
            return SVG.Style.LineCap.Butt;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineCap.Round;
        }
        if ("square".equals(str)) {
            return SVG.Style.LineCap.Square;
        }
        return null;
    }

    private void D(SVG.j0 j0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                j0Var.c = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    j0Var.d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(trim)) {
                        j0Var.d = Boolean.TRUE;
                        return;
                    }
                    throw new SVGParseException("Invalid value for \"xml:space\" attribute: " + trim);
                }
            }
        }
    }

    private static SVG.Style.LineJoin D0(String str) {
        if ("miter".equals(str)) {
            return SVG.Style.LineJoin.Miter;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineJoin.Round;
        }
        if ("bevel".equals(str)) {
            return SVG.Style.LineJoin.Bevel;
        }
        return null;
    }

    private void E(SVG.i iVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 10:
                    SVG.o o0 = o0(trim);
                    iVar.q = o0;
                    if (o0.g()) {
                        throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                case 11:
                    SVG.o o02 = o0(trim);
                    iVar.r = o02;
                    if (o02.g()) {
                        throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                case 12:
                    iVar.o = o0(trim);
                    break;
                case 13:
                    iVar.p = o0(trim);
                    break;
            }
        }
    }

    private static void E0(SVG.j0 j0Var, String str) {
        g gVar = new g(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String s = gVar.s(':');
            gVar.A();
            if (!gVar.f(':')) {
                return;
            }
            gVar.A();
            String u = gVar.u(';');
            if (u == null) {
                return;
            }
            gVar.A();
            if (gVar.h() || gVar.f(';')) {
                if (j0Var.f == null) {
                    j0Var.f = new SVG.Style();
                }
                S0(j0Var.f, s, u);
                gVar.A();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void F(com.caverock.androidsvg.SVG.j r5, org.xml.sax.Attributes r6) {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L90
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = com.caverock.androidsvg.SVGParser.a.b
            java.lang.String r3 = r6.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 6
            if (r2 == r3) goto L72
            switch(r2) {
                case 32: goto L50;
                case 33: goto L49;
                case 34: goto L26;
                default: goto L25;
            }
        L25:
            goto L8c
        L26:
            com.caverock.androidsvg.SVG$GradientSpread r2 = com.caverock.androidsvg.SVG.GradientSpread.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L2d
            r5.k = r2     // Catch: java.lang.IllegalArgumentException -> L2d
            goto L8c
        L2d:
            com.caverock.androidsvg.SVGParseException r4 = new com.caverock.androidsvg.SVGParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Invalid spreadMethod attribute. \""
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = "\" is not a valid value."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L49:
            android.graphics.Matrix r1 = r4.J0(r1)
            r5.j = r1
            goto L8c
        L50:
            java.lang.String r2 = "objectBoundingBox"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L5d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.i = r1
            goto L8c
        L5d:
            java.lang.String r2 = "userSpaceOnUse"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L6a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.i = r1
            goto L8c
        L6a:
            com.caverock.androidsvg.SVGParseException r4 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r5 = "Invalid value for attribute gradientUnits"
            r4.<init>(r5)
            throw r4
        L72:
            java.lang.String r2 = ""
            java.lang.String r3 = r6.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L8a
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r6.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8c
        L8a:
            r5.l = r1
        L8c:
            int r0 = r0 + 1
            goto L1
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.F(com.caverock.androidsvg.SVG$j, org.xml.sax.Attributes):void");
    }

    private static Set F0(String str) {
        g gVar = new g(str);
        HashSet hashSet = new HashSet();
        while (!gVar.h()) {
            String r = gVar.r();
            int indexOf = r.indexOf(45);
            if (indexOf != -1) {
                r = r.substring(0, indexOf);
            }
            hashSet.add(new Locale(r, "", "").getLanguage());
            gVar.A();
        }
        return hashSet;
    }

    private void G(SVG.n nVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                nVar.q = o0(trim);
            } else if (i2 == 2) {
                nVar.r = o0(trim);
            } else if (i2 == 3) {
                SVG.o o0 = o0(trim);
                nVar.s = o0;
                if (o0.g()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                SVG.o o02 = o0(trim);
                nVar.t = o02;
                if (o02.g()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i2 != 6) {
                if (i2 == 7) {
                    w0(nVar, trim);
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                nVar.p = trim;
            }
        }
    }

    private static SVG.Style.TextAnchor G0(String str) {
        str.hashCode();
        switch (str) {
            case "middle":
                return SVG.Style.TextAnchor.Middle;
            case "end":
                return SVG.Style.TextAnchor.End;
            case "start":
                return SVG.Style.TextAnchor.Start;
            default:
                return null;
        }
    }

    private void H(SVG.p pVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    pVar.o = o0(trim);
                    break;
                case 16:
                    pVar.p = o0(trim);
                    break;
                case 17:
                    pVar.q = o0(trim);
                    break;
                case 18:
                    pVar.r = o0(trim);
                    break;
            }
        }
    }

    private static SVG.Style.TextDecoration H0(String str) {
        str.hashCode();
        switch (str) {
            case "line-through":
                return SVG.Style.TextDecoration.LineThrough;
            case "underline":
                return SVG.Style.TextDecoration.Underline;
            case "none":
                return SVG.Style.TextDecoration.None;
            case "blink":
                return SVG.Style.TextDecoration.Blink;
            case "overline":
                return SVG.Style.TextDecoration.Overline;
            default:
                return null;
        }
    }

    private void I(SVG.k0 k0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    k0Var.m = o0(trim);
                    break;
                case 16:
                    k0Var.n = o0(trim);
                    break;
                case 17:
                    k0Var.o = o0(trim);
                    break;
                case 18:
                    k0Var.p = o0(trim);
                    break;
            }
        }
    }

    private static SVG.Style.TextDirection I0(String str) {
        str.hashCode();
        if (str.equals("ltr")) {
            return SVG.Style.TextDirection.LTR;
        }
        if (str.equals("rtl")) {
            return SVG.Style.TextDirection.RTL;
        }
        return null;
    }

    private void J(SVG.q qVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case EventType.CDN /* 26 */:
                    qVar.r = o0(trim);
                    break;
                case 27:
                    qVar.s = o0(trim);
                    break;
                case 28:
                    SVG.o o0 = o0(trim);
                    qVar.t = o0;
                    if (o0.g()) {
                        throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    SVG.o o02 = o0(trim);
                    qVar.u = o02;
                    if (o02.g()) {
                        throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                case 30:
                    if (!"strokeWidth".equals(trim)) {
                        if (!"userSpaceOnUse".equals(trim)) {
                            throw new SVGParseException("Invalid value for attribute markerUnits");
                        }
                        qVar.q = true;
                        break;
                    } else {
                        qVar.q = false;
                        break;
                    }
                case 31:
                    if (DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(trim)) {
                        qVar.v = Float.valueOf(Float.NaN);
                        break;
                    } else {
                        qVar.v = Float.valueOf(f0(trim));
                        break;
                    }
            }
        }
    }

    private Matrix J0(String str) {
        Matrix matrix = new Matrix();
        g gVar = new g(str);
        gVar.A();
        while (!gVar.h()) {
            String o = gVar.o();
            if (o == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: " + str);
            }
            switch (o) {
                case "matrix":
                    gVar.A();
                    float n = gVar.n();
                    gVar.z();
                    float n2 = gVar.n();
                    gVar.z();
                    float n3 = gVar.n();
                    gVar.z();
                    float n4 = gVar.n();
                    gVar.z();
                    float n5 = gVar.n();
                    gVar.z();
                    float n6 = gVar.n();
                    gVar.A();
                    if (!Float.isNaN(n6) && gVar.f(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{n, n3, n5, n2, n4, n6, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    break;
                case "rotate":
                    gVar.A();
                    float n7 = gVar.n();
                    float x = gVar.x();
                    float x2 = gVar.x();
                    gVar.A();
                    if (Float.isNaN(n7) || !gVar.f(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(x)) {
                        matrix.preRotate(n7);
                        break;
                    } else if (!Float.isNaN(x2)) {
                        matrix.preRotate(n7, x, x2);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                case "scale":
                    gVar.A();
                    float n8 = gVar.n();
                    float x3 = gVar.x();
                    gVar.A();
                    if (!Float.isNaN(n8) && gVar.f(')')) {
                        if (!Float.isNaN(x3)) {
                            matrix.preScale(n8, x3);
                            break;
                        } else {
                            matrix.preScale(n8, n8);
                            break;
                        }
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    break;
                case "skewX":
                    gVar.A();
                    float n9 = gVar.n();
                    gVar.A();
                    if (!Float.isNaN(n9) && gVar.f(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(n9)), 0.0f);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    break;
                case "skewY":
                    gVar.A();
                    float n10 = gVar.n();
                    gVar.A();
                    if (!Float.isNaN(n10) && gVar.f(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(n10)));
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                case "translate":
                    gVar.A();
                    float n11 = gVar.n();
                    float x4 = gVar.x();
                    gVar.A();
                    if (!Float.isNaN(n11) && gVar.f(')')) {
                        if (!Float.isNaN(x4)) {
                            matrix.preTranslate(n11, x4);
                            break;
                        } else {
                            matrix.preTranslate(n11, 0.0f);
                            break;
                        }
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    break;
                default:
                    throw new SVGParseException("Invalid transform list fn: " + o + ")");
            }
            if (gVar.h()) {
                return matrix;
            }
            gVar.z();
        }
        return matrix;
    }

    private void K(SVG.r rVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                rVar.q = o0(trim);
            } else if (i2 == 2) {
                rVar.r = o0(trim);
            } else if (i2 == 3) {
                SVG.o o0 = o0(trim);
                rVar.s = o0;
                if (o0.g()) {
                    throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                SVG.o o02 = o0(trim);
                rVar.t = o02;
                if (o02.g()) {
                    throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                }
            } else if (i2 != 43) {
                if (i2 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(trim)) {
                    rVar.p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(trim)) {
                        throw new SVGParseException("Invalid value for attribute maskContentUnits");
                    }
                    rVar.p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                rVar.o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(trim)) {
                    throw new SVGParseException("Invalid value for attribute maskUnits");
                }
                rVar.o = Boolean.TRUE;
            }
        }
    }

    private void K0(InputStream inputStream) {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            f fVar = new f(this, null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e2) {
            throw new SVGParseException("Stream error", e2);
        } catch (ParserConfigurationException e3) {
            throw new SVGParseException("XML parser problem", e3);
        } catch (SAXException e4) {
            throw new SVGParseException("SVG parse error", e4);
        }
    }

    private void L(SVG.u uVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 8) {
                uVar.o = u0(trim);
            } else if (i2 != 9) {
                continue;
            } else {
                Float valueOf = Float.valueOf(f0(trim));
                uVar.p = valueOf;
                if (valueOf.floatValue() < 0.0f) {
                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    private void L0(InputStream inputStream, boolean z) {
        try {
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                h hVar = new h(newPullParser);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                newPullParser.setInput(inputStream, null);
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                    if (eventType == 0) {
                        W0();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + newPullParser.getText());
                        g gVar = new g(newPullParser.getText());
                        r(gVar.r(), x0(gVar));
                    } else if (eventType != 10) {
                        if (eventType == 2) {
                            String name = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name = newPullParser.getPrefix() + ':' + name;
                            }
                            X0(newPullParser.getNamespace(), newPullParser.getName(), name, hVar);
                        } else if (eventType == 3) {
                            String name2 = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name2 = newPullParser.getPrefix() + ':' + name2;
                            }
                            p(newPullParser.getNamespace(), newPullParser.getName(), name2);
                        } else if (eventType == 4) {
                            int[] iArr = new int[2];
                            e1(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                        } else if (eventType == 5) {
                            c1(newPullParser.getText());
                        }
                    } else if (z && this.a.m() == null && newPullParser.getText().contains("<!ENTITY ")) {
                        try {
                            Log.d("SVGParser", "Switching to SAX parser to process entities");
                            inputStream.reset();
                            K0(inputStream);
                            return;
                        } catch (IOException unused) {
                            Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                            return;
                        }
                    }
                }
                o();
            } catch (IOException e2) {
                throw new SVGParseException("Stream error", e2);
            }
        } catch (XmlPullParserException e3) {
            throw new SVGParseException("XML parser problem", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void M(com.caverock.androidsvg.SVG.x r6, org.xml.sax.Attributes r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            int r1 = r7.getLength()
            if (r0 >= r1) goto Ld3
            java.lang.String r1 = r7.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = com.caverock.androidsvg.SVGParser.a.b
            java.lang.String r3 = r7.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto Lc9
            r3 = 2
            if (r2 == r3) goto Lc2
            r3 = 3
            if (r2 == r3) goto Lad
            r3 = 4
            if (r2 == r3) goto L98
            r3 = 6
            if (r2 == r3) goto L7d
            java.lang.String r3 = "userSpaceOnUse"
            java.lang.String r4 = "objectBoundingBox"
            switch(r2) {
                case 40: goto L5f;
                case 41: goto L3f;
                case 42: goto L37;
                default: goto L35;
            }
        L35:
            goto Lcf
        L37:
            android.graphics.Matrix r1 = r5.J0(r1)
            r6.s = r1
            goto Lcf
        L3f:
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L4b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.r = r1
            goto Lcf
        L4b:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L57
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.r = r1
            goto Lcf
        L57:
            com.caverock.androidsvg.SVGParseException r5 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r6 = "Invalid value for attribute patternContentUnits"
            r5.<init>(r6)
            throw r5
        L5f:
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L6a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.q = r1
            goto Lcf
        L6a:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L75
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.q = r1
            goto Lcf
        L75:
            com.caverock.androidsvg.SVGParseException r5 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r6 = "Invalid value for attribute patternUnits"
            r5.<init>(r6)
            throw r5
        L7d:
            java.lang.String r2 = ""
            java.lang.String r3 = r7.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L95
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r7.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lcf
        L95:
            r6.x = r1
            goto Lcf
        L98:
            com.caverock.androidsvg.SVG$o r1 = o0(r1)
            r6.w = r1
            boolean r1 = r1.g()
            if (r1 != 0) goto La5
            goto Lcf
        La5:
            com.caverock.androidsvg.SVGParseException r5 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r6 = "Invalid <pattern> element. height cannot be negative"
            r5.<init>(r6)
            throw r5
        Lad:
            com.caverock.androidsvg.SVG$o r1 = o0(r1)
            r6.v = r1
            boolean r1 = r1.g()
            if (r1 != 0) goto Lba
            goto Lcf
        Lba:
            com.caverock.androidsvg.SVGParseException r5 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r6 = "Invalid <pattern> element. width cannot be negative"
            r5.<init>(r6)
            throw r5
        Lc2:
            com.caverock.androidsvg.SVG$o r1 = o0(r1)
            r6.u = r1
            goto Lcf
        Lc9:
            com.caverock.androidsvg.SVG$o r1 = o0(r1)
            r6.t = r1
        Lcf:
            int r0 = r0 + 1
            goto L1
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.M(com.caverock.androidsvg.SVG$x, org.xml.sax.Attributes):void");
    }

    private static SVG.Style.VectorEffect M0(String str) {
        str.hashCode();
        if (str.equals("none")) {
            return SVG.Style.VectorEffect.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return SVG.Style.VectorEffect.NonScalingStroke;
        }
        return null;
    }

    private void N(SVG.y yVar, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.points) {
                g gVar = new g(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                gVar.A();
                while (!gVar.h()) {
                    float n = gVar.n();
                    if (Float.isNaN(n)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    gVar.z();
                    float n2 = gVar.n();
                    if (Float.isNaN(n2)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    gVar.z();
                    arrayList.add(Float.valueOf(n));
                    arrayList.add(Float.valueOf(n2));
                }
                yVar.o = new float[arrayList.size()];
                Iterator it2 = arrayList.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    yVar.o[i2] = ((Float) it2.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    private static SVG.b N0(String str) {
        g gVar = new g(str);
        gVar.A();
        float n = gVar.n();
        gVar.z();
        float n2 = gVar.n();
        gVar.z();
        float n3 = gVar.n();
        gVar.z();
        float n4 = gVar.n();
        if (Float.isNaN(n) || Float.isNaN(n2) || Float.isNaN(n3) || Float.isNaN(n4)) {
            throw new SVGParseException("Invalid viewBox definition - should have four numbers");
        }
        if (n3 < 0.0f) {
            throw new SVGParseException("Invalid viewBox. width cannot be negative");
        }
        if (n4 >= 0.0f) {
            return new SVG.b(n, n2, n3, n4);
        }
        throw new SVGParseException("Invalid viewBox. height cannot be negative");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void O(com.caverock.androidsvg.SVG.o0 r4, org.xml.sax.Attributes r5) {
        /*
            r3 = this;
            r3 = 0
        L1:
            int r0 = r5.getLength()
            if (r3 >= r0) goto L5e
            java.lang.String r0 = r5.getValue(r3)
            java.lang.String r0 = r0.trim()
            int[] r1 = com.caverock.androidsvg.SVGParser.a.b
            java.lang.String r2 = r5.getLocalName(r3)
            com.caverock.androidsvg.SVGParser$SVGAttr r2 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r2)
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 35
            if (r1 == r2) goto L55
            r2 = 36
            if (r1 == r2) goto L4e
            switch(r1) {
                case 12: goto L47;
                case 13: goto L40;
                case 14: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L5b
        L2b:
            com.caverock.androidsvg.SVG$o r0 = o0(r0)
            r4.o = r0
            boolean r0 = r0.g()
            if (r0 != 0) goto L38
            goto L5b
        L38:
            com.caverock.androidsvg.SVGParseException r3 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r4 = "Invalid <radialGradient> element. r cannot be negative"
            r3.<init>(r4)
            throw r3
        L40:
            com.caverock.androidsvg.SVG$o r0 = o0(r0)
            r4.n = r0
            goto L5b
        L47:
            com.caverock.androidsvg.SVG$o r0 = o0(r0)
            r4.m = r0
            goto L5b
        L4e:
            com.caverock.androidsvg.SVG$o r0 = o0(r0)
            r4.q = r0
            goto L5b
        L55:
            com.caverock.androidsvg.SVG$o r0 = o0(r0)
            r4.p = r0
        L5b:
            int r3 = r3 + 1
            goto L1
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.O(com.caverock.androidsvg.SVG$o0, org.xml.sax.Attributes):void");
    }

    private void O0(Attributes attributes) {
        l("<path>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.u uVar = new SVG.u();
        uVar.a = this.a;
        uVar.b = this.b;
        D(uVar, attributes);
        S(uVar, attributes);
        W(uVar, attributes);
        C(uVar, attributes);
        L(uVar, attributes);
        this.b.g(uVar);
    }

    private void P(SVG.a0 a0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                a0Var.o = o0(trim);
            } else if (i2 == 2) {
                a0Var.p = o0(trim);
            } else if (i2 == 3) {
                SVG.o o0 = o0(trim);
                a0Var.q = o0;
                if (o0.g()) {
                    throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                SVG.o o02 = o0(trim);
                a0Var.r = o02;
                if (o02.g()) {
                    throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                }
            } else if (i2 == 10) {
                SVG.o o03 = o0(trim);
                a0Var.s = o03;
                if (o03.g()) {
                    throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i2 != 11) {
                continue;
            } else {
                SVG.o o04 = o0(trim);
                a0Var.t = o04;
                if (o04.g()) {
                    throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    private void P0(Attributes attributes) {
        l("<pattern>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.x xVar = new SVG.x();
        xVar.a = this.a;
        xVar.b = this.b;
        D(xVar, attributes);
        S(xVar, attributes);
        C(xVar, attributes);
        Y(xVar, attributes);
        M(xVar, attributes);
        this.b.g(xVar);
        this.b = xVar;
    }

    private void Q(SVG.d0 d0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                d0Var.q = o0(trim);
            } else if (i2 == 2) {
                d0Var.r = o0(trim);
            } else if (i2 == 3) {
                SVG.o o0 = o0(trim);
                d0Var.s = o0;
                if (o0.g()) {
                    throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                SVG.o o02 = o0(trim);
                d0Var.t = o02;
                if (o02.g()) {
                    throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                }
            } else if (i2 == 5) {
                d0Var.u = trim;
            }
        }
    }

    private void Q0(Attributes attributes) {
        l("<polygon>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.y zVar = new SVG.z();
        zVar.a = this.a;
        zVar.b = this.b;
        D(zVar, attributes);
        S(zVar, attributes);
        W(zVar, attributes);
        C(zVar, attributes);
        N(zVar, attributes, "polygon");
        this.b.g(zVar);
    }

    private void R(SVG.c0 c0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 37) {
                c0Var.h = n0(trim);
            }
        }
    }

    private void R0(Attributes attributes) {
        l("<polyline>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.y yVar = new SVG.y();
        yVar.a = this.a;
        yVar.b = this.b;
        D(yVar, attributes);
        S(yVar, attributes);
        W(yVar, attributes);
        C(yVar, attributes);
        N(yVar, attributes, "polyline");
        this.b.g(yVar);
    }

    private void S(SVG.j0 j0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
                if (i2 == 45) {
                    E0(j0Var, trim);
                } else if (i2 != 46) {
                    if (j0Var.e == null) {
                        j0Var.e = new SVG.Style();
                    }
                    S0(j0Var.e, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    j0Var.g = CSSParser.f(trim);
                }
            }
        }
    }

    static void S0(SVG.Style style, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.b[SVGAttr.fromString(str).ordinal()]) {
                case 47:
                    SVG.m0 t0 = t0(str2);
                    style.b = t0;
                    if (t0 != null) {
                        style.a |= 1;
                        return;
                    }
                    return;
                case 48:
                    SVG.Style.FillRule e0 = e0(str2);
                    style.c = e0;
                    if (e0 != null) {
                        style.a |= 2;
                        return;
                    }
                    return;
                case 49:
                    Float r0 = r0(str2);
                    style.d = r0;
                    if (r0 != null) {
                        style.a |= 4;
                        return;
                    }
                    return;
                case 50:
                    SVG.m0 t02 = t0(str2);
                    style.e = t02;
                    if (t02 != null) {
                        style.a |= 8;
                        return;
                    }
                    return;
                case 51:
                    Float r02 = r0(str2);
                    style.f = r02;
                    if (r02 != null) {
                        style.a |= 16;
                        return;
                    }
                    return;
                case 52:
                    style.g = o0(str2);
                    style.a |= 32;
                    break;
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    SVG.Style.LineCap C0 = C0(str2);
                    style.h = C0;
                    if (C0 != null) {
                        style.a |= 64;
                        return;
                    }
                    return;
                case 54:
                    SVG.Style.LineJoin D0 = D0(str2);
                    style.i = D0;
                    if (D0 != null) {
                        style.a |= 128;
                        return;
                    }
                    return;
                case 55:
                    style.j = Float.valueOf(f0(str2));
                    style.a |= 256;
                    break;
                case 56:
                    if ("none".equals(str2)) {
                        style.k = null;
                        style.a |= 512;
                        return;
                    }
                    SVG.o[] B0 = B0(str2);
                    style.k = B0;
                    if (B0 != null) {
                        style.a |= 512;
                        return;
                    }
                    return;
                case 57:
                    style.l = o0(str2);
                    style.a |= 1024;
                    break;
                case 58:
                    style.m = r0(str2);
                    style.a |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
                    return;
                case 59:
                    style.n = b0(str2);
                    style.a |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    h0(style, str2);
                    return;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    List i0 = i0(str2);
                    style.r = i0;
                    if (i0 != null) {
                        style.a |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                        return;
                    }
                    return;
                case 62:
                    SVG.o j0 = j0(str2);
                    style.s = j0;
                    if (j0 != null) {
                        style.a |= 16384;
                        return;
                    }
                    return;
                case 63:
                    Integer l0 = l0(str2);
                    style.t = l0;
                    if (l0 != null) {
                        style.a |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                        return;
                    }
                    return;
                case 64:
                    SVG.Style.FontStyle k0 = k0(str2);
                    style.u = k0;
                    if (k0 != null) {
                        style.a |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                        return;
                    }
                    return;
                case 65:
                    SVG.Style.TextDecoration H0 = H0(str2);
                    style.w = H0;
                    if (H0 != null) {
                        style.a |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                        return;
                    }
                    return;
                case 66:
                    SVG.Style.TextDirection I0 = I0(str2);
                    style.x = I0;
                    if (I0 != null) {
                        style.a |= 68719476736L;
                        return;
                    }
                    return;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    SVG.Style.TextAnchor G0 = G0(str2);
                    style.y = G0;
                    if (G0 != null) {
                        style.a |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        return;
                    }
                    return;
                case 68:
                    Boolean s0 = s0(str2);
                    style.B = s0;
                    if (s0 != null) {
                        style.a |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
                        return;
                    }
                    return;
                case 69:
                    String m0 = m0(str2, str);
                    style.L = m0;
                    style.M = m0;
                    style.N = m0;
                    style.a |= 14680064;
                    return;
                case 70:
                    style.L = m0(str2, str);
                    style.a |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
                    return;
                case 71:
                    style.M = m0(str2, str);
                    style.a |= PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
                    return;
                case 72:
                    style.N = m0(str2, str);
                    style.a |= 8388608;
                    return;
                case ModuleDescriptor.MODULE_VERSION /* 73 */:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            style.Q = Boolean.valueOf(!str2.equals("none"));
                            style.a |= 16777216;
                            return;
                        }
                        return;
                    }
                    return;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            style.S = Boolean.valueOf(str2.equals("visible"));
                            style.a |= 33554432;
                            return;
                        }
                        return;
                    }
                    return;
                case 75:
                    if (str2.equals("currentColor")) {
                        style.X = SVG.g.a();
                    } else {
                        try {
                            style.X = b0(str2);
                        } catch (SVGParseException e2) {
                            Log.w("SVGParser", e2.getMessage());
                            return;
                        }
                    }
                    style.a |= 67108864;
                    return;
                case 76:
                    style.Y = r0(str2);
                    style.a |= 134217728;
                    return;
                case AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX /* 77 */:
                    SVG.c a0 = a0(str2);
                    style.H = a0;
                    if (a0 != null) {
                        style.a |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                        return;
                    }
                    return;
                case 78:
                    style.Z = m0(str2, str);
                    style.a |= 268435456;
                    return;
                case 79:
                    style.e0 = e0(str2);
                    style.a |= 536870912;
                    return;
                case 80:
                    style.f0 = m0(str2, str);
                    style.a |= Constants.GB;
                    return;
                case 81:
                    if (str2.equals("currentColor")) {
                        style.g0 = SVG.g.a();
                    } else {
                        try {
                            style.g0 = b0(str2);
                        } catch (SVGParseException e3) {
                            Log.w("SVGParser", e3.getMessage());
                            return;
                        }
                    }
                    style.a |= 2147483648L;
                    return;
                case 82:
                    style.h0 = r0(str2);
                    style.a |= 4294967296L;
                    return;
                case 83:
                    if (str2.equals("currentColor")) {
                        style.i0 = SVG.g.a();
                    } else {
                        try {
                            style.i0 = b0(str2);
                        } catch (SVGParseException e4) {
                            Log.w("SVGParser", e4.getMessage());
                            return;
                        }
                    }
                    style.a |= 8589934592L;
                    return;
                case 84:
                    style.j0 = r0(str2);
                    style.a |= 17179869184L;
                    return;
                case 85:
                    SVG.Style.VectorEffect M0 = M0(str2);
                    style.k0 = M0;
                    if (M0 != null) {
                        style.a |= 34359738368L;
                        return;
                    }
                    return;
                case 86:
                    SVG.Style.RenderQuality y0 = y0(str2);
                    style.l0 = y0;
                    if (y0 != null) {
                        style.a |= 137438953472L;
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (SVGParseException unused) {
        }
    }

    private void T(SVG.s0 s0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 6 && ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i)))) {
                s0Var.o = trim;
            }
        }
    }

    private void T0(Attributes attributes) {
        l("<radialGradient>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.o0 o0Var = new SVG.o0();
        o0Var.a = this.a;
        o0Var.b = this.b;
        D(o0Var, attributes);
        S(o0Var, attributes);
        F(o0Var, attributes);
        O(o0Var, attributes);
        this.b.g(o0Var);
        this.b = o0Var;
    }

    private void U(SVG.x0 x0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 != 6) {
                if (i2 == 39) {
                    x0Var.p = o0(trim);
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                x0Var.o = trim;
            }
        }
    }

    private void U0(Attributes attributes) {
        l("<rect>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.a0 a0Var = new SVG.a0();
        a0Var.a = this.a;
        a0Var.b = this.b;
        D(a0Var, attributes);
        S(a0Var, attributes);
        W(a0Var, attributes);
        C(a0Var, attributes);
        P(a0Var, attributes);
        this.b.g(a0Var);
    }

    private void V(SVG.y0 y0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                y0Var.o = p0(trim);
            } else if (i2 == 2) {
                y0Var.p = p0(trim);
            } else if (i2 == 19) {
                y0Var.q = p0(trim);
            } else if (i2 == 20) {
                y0Var.r = p0(trim);
            }
        }
    }

    private void V0(Attributes attributes) {
        l("<solidColor>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.b0 b0Var = new SVG.b0();
        b0Var.a = this.a;
        b0Var.b = this.b;
        D(b0Var, attributes);
        S(b0Var, attributes);
        this.b.g(b0Var);
        this.b = b0Var;
    }

    private void W(SVG.m mVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.transform) {
                mVar.j(J0(attributes.getValue(i)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() {
        this.a = new SVG();
    }

    private void X(SVG.b1 b1Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                b1Var.q = o0(trim);
            } else if (i2 == 2) {
                b1Var.r = o0(trim);
            } else if (i2 == 3) {
                SVG.o o0 = o0(trim);
                b1Var.s = o0;
                if (o0.g()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                SVG.o o02 = o0(trim);
                b1Var.t = o02;
                if (o02.g()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i2 == 6 && ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i)))) {
                b1Var.p = trim;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(String str, String str2, String str3, Attributes attributes) {
        if (this.c) {
            this.d++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            SVGElem fromString = SVGElem.fromString(str2);
            switch (a.a[fromString.ordinal()]) {
                case 1:
                    a1(attributes);
                    break;
                case 2:
                case 3:
                    q(attributes);
                    break;
                case 4:
                    m(attributes);
                    break;
                case 5:
                    i1(attributes);
                    break;
                case 6:
                    O0(attributes);
                    break;
                case 7:
                    U0(attributes);
                    break;
                case 8:
                    i(attributes);
                    break;
                case 9:
                    n(attributes);
                    break;
                case 10:
                    v(attributes);
                    break;
                case 11:
                    R0(attributes);
                    break;
                case 12:
                    Q0(attributes);
                    break;
                case 13:
                    d1(attributes);
                    break;
                case 14:
                    h1(attributes);
                    break;
                case 15:
                    g1(attributes);
                    break;
                case 16:
                    k1(attributes);
                    break;
                case 17:
                    b1(attributes);
                    break;
                case 18:
                    x(attributes);
                    break;
                case 19:
                    w(attributes);
                    break;
                case 20:
                    T0(attributes);
                    break;
                case 21:
                    Y0(attributes);
                    break;
                case 22:
                case 23:
                    this.e = true;
                    this.f = fromString;
                    break;
                case 24:
                    k(attributes);
                    break;
                case EventType.SUBS /* 25 */:
                    f1(attributes);
                    break;
                case EventType.CDN /* 26 */:
                    P0(attributes);
                    break;
                case 27:
                    u(attributes);
                    break;
                case 28:
                    j1(attributes);
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    y(attributes);
                    break;
                case 30:
                    Z0(attributes);
                    break;
                case 31:
                    V0(attributes);
                    break;
                default:
                    this.c = true;
                    this.d = 1;
                    break;
            }
        }
    }

    private void Y(SVG.p0 p0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 7) {
                w0(p0Var, trim);
            } else if (i2 == 87) {
                p0Var.p = N0(trim);
            }
        }
    }

    private void Y0(Attributes attributes) {
        l("<stop>", new Object[0]);
        SVG.h0 h0Var = this.b;
        if (h0Var == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(h0Var instanceof SVG.j)) {
            throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        SVG.c0 c0Var = new SVG.c0();
        c0Var.a = this.a;
        c0Var.b = this.b;
        D(c0Var, attributes);
        S(c0Var, attributes);
        R(c0Var, attributes);
        this.b.g(c0Var);
        this.b = c0Var;
    }

    private void Z(String str) {
        this.a.a(new CSSParser(CSSParser.MediaType.screen, CSSParser.Source.Document).d(str));
    }

    private void Z0(Attributes attributes) {
        l("<style>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean z = true;
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 88) {
                z = trim.equals("text/css");
            } else if (i2 == 89) {
                str = trim;
            }
        }
        if (z && CSSParser.b(str, CSSParser.MediaType.screen)) {
            this.h = true;
        } else {
            this.c = true;
            this.d = 1;
        }
    }

    private static SVG.c a0(String str) {
        if (DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        g gVar = new g(str.substring(5));
        gVar.A();
        SVG.o q0 = q0(gVar);
        gVar.z();
        SVG.o q02 = q0(gVar);
        gVar.z();
        SVG.o q03 = q0(gVar);
        gVar.z();
        SVG.o q04 = q0(gVar);
        gVar.A();
        if (gVar.f(')') || gVar.h()) {
            return new SVG.c(q0, q02, q03, q04);
        }
        return null;
    }

    private void a1(Attributes attributes) {
        l("<svg>", new Object[0]);
        SVG.d0 d0Var = new SVG.d0();
        d0Var.a = this.a;
        d0Var.b = this.b;
        D(d0Var, attributes);
        S(d0Var, attributes);
        C(d0Var, attributes);
        Y(d0Var, attributes);
        Q(d0Var, attributes);
        SVG.h0 h0Var = this.b;
        if (h0Var == null) {
            this.a.u(d0Var);
        } else {
            h0Var.g(d0Var);
        }
        this.b = d0Var;
    }

    private static SVG.f b0(String str) {
        if (str.charAt(0) == '#') {
            com.caverock.androidsvg.a b2 = com.caverock.androidsvg.a.b(str, 1, str.length());
            if (b2 == null) {
                throw new SVGParseException("Bad hex colour value: " + str);
            }
            int a2 = b2.a();
            if (a2 == 4) {
                int d2 = b2.d();
                int i = d2 & 3840;
                int i2 = d2 & 240;
                int i3 = d2 & 15;
                return new SVG.f(i3 | (i << 8) | (-16777216) | (i << 12) | (i2 << 8) | (i2 << 4) | (i3 << 4));
            }
            if (a2 == 5) {
                int d3 = b2.d();
                int i4 = 61440 & d3;
                int i5 = d3 & 3840;
                int i6 = d3 & 240;
                int i7 = d3 & 15;
                return new SVG.f((i7 << 24) | (i7 << 28) | (i4 << 8) | (i4 << 4) | (i5 << 4) | i5 | i6 | (i6 >> 4));
            }
            if (a2 == 7) {
                return new SVG.f(b2.d() | (-16777216));
            }
            if (a2 == 9) {
                return new SVG.f((b2.d() >>> 8) | (b2.d() << 24));
            }
            throw new SVGParseException("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        if (!startsWith && !lowerCase.startsWith("rgb(")) {
            boolean startsWith2 = lowerCase.startsWith("hsla(");
            if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
                return c0(lowerCase);
            }
            g gVar = new g(str.substring(startsWith2 ? 5 : 4));
            gVar.A();
            float n = gVar.n();
            float d4 = gVar.d(n);
            if (!Float.isNaN(d4)) {
                gVar.f('%');
            }
            float d5 = gVar.d(d4);
            if (!Float.isNaN(d5)) {
                gVar.f('%');
            }
            if (!startsWith2) {
                gVar.A();
                if (!Float.isNaN(d5) && gVar.f(')')) {
                    return new SVG.f(s(n, d4, d5) | (-16777216));
                }
                throw new SVGParseException("Bad hsl() colour value: " + str);
            }
            float d6 = gVar.d(d5);
            gVar.A();
            if (!Float.isNaN(d6) && gVar.f(')')) {
                return new SVG.f((j(d6 * 256.0f) << 24) | s(n, d4, d5));
            }
            throw new SVGParseException("Bad hsla() colour value: " + str);
        }
        g gVar2 = new g(str.substring(startsWith ? 5 : 4));
        gVar2.A();
        float n2 = gVar2.n();
        if (!Float.isNaN(n2) && gVar2.f('%')) {
            n2 = (n2 * 256.0f) / 100.0f;
        }
        float d7 = gVar2.d(n2);
        if (!Float.isNaN(d7) && gVar2.f('%')) {
            d7 = (d7 * 256.0f) / 100.0f;
        }
        float d8 = gVar2.d(d7);
        if (!Float.isNaN(d8) && gVar2.f('%')) {
            d8 = (d8 * 256.0f) / 100.0f;
        }
        if (!startsWith) {
            gVar2.A();
            if (!Float.isNaN(d8) && gVar2.f(')')) {
                return new SVG.f((j(n2) << 16) | (-16777216) | (j(d7) << 8) | j(d8));
            }
            throw new SVGParseException("Bad rgb() colour value: " + str);
        }
        float d9 = gVar2.d(d8);
        gVar2.A();
        if (!Float.isNaN(d9) && gVar2.f(')')) {
            return new SVG.f((j(d9 * 256.0f) << 24) | (j(n2) << 16) | (j(d7) << 8) | j(d8));
        }
        throw new SVGParseException("Bad rgba() colour value: " + str);
    }

    private void b1(Attributes attributes) {
        l("<symbol>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.p0 r0Var = new SVG.r0();
        r0Var.a = this.a;
        r0Var.b = this.b;
        D(r0Var, attributes);
        S(r0Var, attributes);
        C(r0Var, attributes);
        Y(r0Var, attributes);
        this.b.g(r0Var);
        this.b = r0Var;
    }

    private static SVG.f c0(String str) {
        Integer a2 = c.a(str);
        if (a2 != null) {
            return new SVG.f(a2.intValue());
        }
        throw new SVGParseException("Invalid colour keyword: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(String str) {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(str.length());
            }
            this.g.append(str);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(str.length());
            }
            this.i.append(str);
        } else if (this.b instanceof SVG.w0) {
            h(str);
        }
    }

    private static SVG.m0 d0(String str) {
        str.hashCode();
        if (str.equals("none")) {
            return SVG.f.c;
        }
        if (str.equals("currentColor")) {
            return SVG.g.a();
        }
        try {
            return b0(str);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    private void d1(Attributes attributes) {
        l("<text>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.u0 u0Var = new SVG.u0();
        u0Var.a = this.a;
        u0Var.b = this.b;
        D(u0Var, attributes);
        S(u0Var, attributes);
        W(u0Var, attributes);
        C(u0Var, attributes);
        V(u0Var, attributes);
        this.b.g(u0Var);
        this.b = u0Var;
    }

    private static SVG.Style.FillRule e0(String str) {
        if ("nonzero".equals(str)) {
            return SVG.Style.FillRule.NonZero;
        }
        if ("evenodd".equals(str)) {
            return SVG.Style.FillRule.EvenOdd;
        }
        return null;
    }

    private void e1(char[] cArr, int i, int i2) {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(i2);
            }
            this.g.append(cArr, i, i2);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
        } else if (this.b instanceof SVG.w0) {
            h(new String(cArr, i, i2));
        }
    }

    private static float f0(String str) {
        int length = str.length();
        if (length != 0) {
            return g0(str, 0, length);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    private void f1(Attributes attributes) {
        l("<textPath>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.x0 x0Var = new SVG.x0();
        x0Var.a = this.a;
        x0Var.b = this.b;
        D(x0Var, attributes);
        S(x0Var, attributes);
        C(x0Var, attributes);
        U(x0Var, attributes);
        this.b.g(x0Var);
        this.b = x0Var;
        SVG.h0 h0Var = x0Var.b;
        if (h0Var instanceof SVG.z0) {
            x0Var.n((SVG.z0) h0Var);
        } else {
            x0Var.n(((SVG.v0) h0Var).d());
        }
    }

    private static float g0(String str, int i, int i2) {
        float b2 = new com.caverock.androidsvg.b().b(str, i, i2);
        if (!Float.isNaN(b2)) {
            return b2;
        }
        throw new SVGParseException("Invalid float value: " + str);
    }

    private void g1(Attributes attributes) {
        l("<tref>", new Object[0]);
        SVG.h0 h0Var = this.b;
        if (h0Var == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(h0Var instanceof SVG.w0)) {
            throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        SVG.s0 s0Var = new SVG.s0();
        s0Var.a = this.a;
        s0Var.b = this.b;
        D(s0Var, attributes);
        S(s0Var, attributes);
        C(s0Var, attributes);
        T(s0Var, attributes);
        this.b.g(s0Var);
        SVG.h0 h0Var2 = s0Var.b;
        if (h0Var2 instanceof SVG.z0) {
            s0Var.n((SVG.z0) h0Var2);
        } else {
            s0Var.n(((SVG.v0) h0Var2).d());
        }
    }

    private void h(String str) {
        SVG.f0 f0Var = (SVG.f0) this.b;
        int size = f0Var.i.size();
        SVG.l0 l0Var = size == 0 ? null : (SVG.l0) f0Var.i.get(size - 1);
        if (!(l0Var instanceof SVG.a1)) {
            this.b.g(new SVG.a1(str));
            return;
        }
        StringBuilder sb = new StringBuilder();
        SVG.a1 a1Var = (SVG.a1) l0Var;
        sb.append(a1Var.c);
        sb.append(str);
        a1Var.c = sb.toString();
    }

    private static void h0(SVG.Style style, String str) {
        String s;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            g gVar = new g(str);
            Integer num = null;
            SVG.Style.FontStyle fontStyle = null;
            String str2 = null;
            while (true) {
                s = gVar.s('/');
                gVar.A();
                if (s != null) {
                    if (num != null && fontStyle != null) {
                        break;
                    }
                    if (!s.equals("normal") && (num != null || (num = e.a(s)) == null)) {
                        if (fontStyle != null || (fontStyle = k0(s)) == null) {
                            if (str2 != null || !s.equals("small-caps")) {
                                break;
                            } else {
                                str2 = s;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            SVG.o j0 = j0(s);
            if (gVar.f('/')) {
                gVar.A();
                String r = gVar.r();
                if (r != null) {
                    try {
                        o0(r);
                    } catch (SVGParseException unused) {
                        return;
                    }
                }
                gVar.A();
            }
            style.r = i0(gVar.y());
            style.s = j0;
            style.t = Integer.valueOf(num == null ? WindowState.NORMAL : num.intValue());
            if (fontStyle == null) {
                fontStyle = SVG.Style.FontStyle.Normal;
            }
            style.u = fontStyle;
            style.a |= 122880;
        }
    }

    private void h1(Attributes attributes) {
        l("<tspan>", new Object[0]);
        SVG.h0 h0Var = this.b;
        if (h0Var == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(h0Var instanceof SVG.w0)) {
            throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        SVG.t0 t0Var = new SVG.t0();
        t0Var.a = this.a;
        t0Var.b = this.b;
        D(t0Var, attributes);
        S(t0Var, attributes);
        C(t0Var, attributes);
        V(t0Var, attributes);
        this.b.g(t0Var);
        this.b = t0Var;
        SVG.h0 h0Var2 = t0Var.b;
        if (h0Var2 instanceof SVG.z0) {
            t0Var.n((SVG.z0) h0Var2);
        } else {
            t0Var.n(((SVG.v0) h0Var2).d());
        }
    }

    private void i(Attributes attributes) {
        l("<circle>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.d dVar = new SVG.d();
        dVar.a = this.a;
        dVar.b = this.b;
        D(dVar, attributes);
        S(dVar, attributes);
        W(dVar, attributes);
        C(dVar, attributes);
        A(dVar, attributes);
        this.b.g(dVar);
    }

    private static List i0(String str) {
        g gVar = new g(str);
        ArrayList arrayList = null;
        do {
            String q = gVar.q();
            if (q == null) {
                q = gVar.u(',');
            }
            if (q == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(q);
            gVar.z();
        } while (!gVar.h());
        return arrayList;
    }

    private void i1(Attributes attributes) {
        l("<use>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.b1 b1Var = new SVG.b1();
        b1Var.a = this.a;
        b1Var.b = this.b;
        D(b1Var, attributes);
        S(b1Var, attributes);
        W(b1Var, attributes);
        C(b1Var, attributes);
        X(b1Var, attributes);
        this.b.g(b1Var);
        this.b = b1Var;
    }

    private static int j(float f2) {
        if (f2 < 0.0f) {
            return 0;
        }
        if (f2 > 255.0f) {
            return 255;
        }
        return Math.round(f2);
    }

    private static SVG.o j0(String str) {
        try {
            SVG.o a2 = d.a(str);
            return a2 == null ? o0(str) : a2;
        } catch (SVGParseException unused) {
            return null;
        }
    }

    private void j1(Attributes attributes) {
        l("<view>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.p0 c1Var = new SVG.c1();
        c1Var.a = this.a;
        c1Var.b = this.b;
        D(c1Var, attributes);
        C(c1Var, attributes);
        Y(c1Var, attributes);
        this.b.g(c1Var);
        this.b = c1Var;
    }

    private void k(Attributes attributes) {
        l("<clipPath>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.e eVar = new SVG.e();
        eVar.a = this.a;
        eVar.b = this.b;
        D(eVar, attributes);
        S(eVar, attributes);
        W(eVar, attributes);
        C(eVar, attributes);
        B(eVar, attributes);
        this.b.g(eVar);
        this.b = eVar;
    }

    private static SVG.Style.FontStyle k0(String str) {
        str.hashCode();
        switch (str) {
            case "oblique":
                return SVG.Style.FontStyle.Oblique;
            case "italic":
                return SVG.Style.FontStyle.Italic;
            case "normal":
                return SVG.Style.FontStyle.Normal;
            default:
                return null;
        }
    }

    private void k1(Attributes attributes) {
        l("<switch>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.q0 q0Var = new SVG.q0();
        q0Var.a = this.a;
        q0Var.b = this.b;
        D(q0Var, attributes);
        S(q0Var, attributes);
        W(q0Var, attributes);
        C(q0Var, attributes);
        this.b.g(q0Var);
        this.b = q0Var;
    }

    private void l(String str, Object... objArr) {
    }

    private static Integer l0(String str) {
        return e.a(str);
    }

    private void m(Attributes attributes) {
        l("<defs>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.h hVar = new SVG.h();
        hVar.a = this.a;
        hVar.b = this.b;
        D(hVar, attributes);
        S(hVar, attributes);
        W(hVar, attributes);
        this.b.g(hVar);
        this.b = hVar;
    }

    private static String m0(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    private void n(Attributes attributes) {
        l("<ellipse>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.i iVar = new SVG.i();
        iVar.a = this.a;
        iVar.b = this.b;
        D(iVar, attributes);
        S(iVar, attributes);
        W(iVar, attributes);
        C(iVar, attributes);
        E(iVar, attributes);
        this.b.g(iVar);
    }

    private Float n0(String str) {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z = false;
        }
        try {
            float g0 = g0(str, 0, length);
            float f2 = 100.0f;
            if (z) {
                g0 /= 100.0f;
            }
            if (g0 < 0.0f) {
                f2 = 0.0f;
            } else if (g0 <= 100.0f) {
                f2 = g0;
            }
            return Float.valueOf(f2);
        } catch (NumberFormatException e2) {
            throw new SVGParseException("Invalid offset value in <stop>: " + str, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
    }

    static SVG.o o0(String str) {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length value (empty string)");
        }
        int length = str.length();
        SVG.Unit unit = SVG.Unit.px;
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            unit = SVG.Unit.percent;
        } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                unit = SVG.Unit.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new SVG.o(g0(str, 0, length), unit);
        } catch (NumberFormatException e2) {
            throw new SVGParseException("Invalid length value: " + str, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str, String str2, String str3) {
        if (this.c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i2 = a.a[SVGElem.fromString(str2).ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 4 && i2 != 5 && i2 != 13 && i2 != 14) {
                switch (i2) {
                    case 22:
                    case 23:
                        this.e = false;
                        StringBuilder sb = this.g;
                        if (sb != null) {
                            SVGElem sVGElem = this.f;
                            if (sVGElem == SVGElem.title) {
                                this.a.v(sb.toString());
                            } else if (sVGElem == SVGElem.desc) {
                                this.a.q(sb.toString());
                            }
                            this.g.setLength(0);
                            break;
                        }
                        break;
                    case 30:
                        StringBuilder sb2 = this.i;
                        if (sb2 != null) {
                            this.h = false;
                            Z(sb2.toString());
                            this.i.setLength(0);
                            break;
                        }
                        break;
                }
                return;
            }
            this.b = ((SVG.l0) this.b).b;
        }
    }

    private static List p0(String str) {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        g gVar = new g(str);
        gVar.A();
        while (!gVar.h()) {
            float n = gVar.n();
            if (Float.isNaN(n)) {
                throw new SVGParseException("Invalid length list value: " + gVar.b());
            }
            SVG.Unit v = gVar.v();
            if (v == null) {
                v = SVG.Unit.px;
            }
            arrayList.add(new SVG.o(n, v));
            gVar.z();
        }
        return arrayList;
    }

    private void q(Attributes attributes) {
        l("<g>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.l lVar = new SVG.l();
        lVar.a = this.a;
        lVar.b = this.b;
        D(lVar, attributes);
        S(lVar, attributes);
        W(lVar, attributes);
        C(lVar, attributes);
        this.b.g(lVar);
        this.b = lVar;
    }

    private static SVG.o q0(g gVar) {
        return gVar.g(DebugKt.DEBUG_PROPERTY_VALUE_AUTO) ? new SVG.o(0.0f) : gVar.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str, Map map) {
        if (str.equals("xml-stylesheet")) {
            SVG.k();
        }
    }

    private static Float r0(String str) {
        try {
            float f0 = f0(str);
            float f2 = 0.0f;
            if (f0 >= 0.0f) {
                f2 = 1.0f;
                if (f0 > 1.0f) {
                }
                return Float.valueOf(f0);
            }
            f0 = f2;
            return Float.valueOf(f0);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    private static int s(float f2, float f3, float f4) {
        float f5 = f2 % 360.0f;
        if (f2 < 0.0f) {
            f5 += 360.0f;
        }
        float f6 = f5 / 60.0f;
        float f7 = f3 / 100.0f;
        float f8 = f4 / 100.0f;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        float f9 = f8 >= 0.0f ? f8 > 1.0f ? 1.0f : f8 : 0.0f;
        float f10 = f9 <= 0.5f ? (f7 + 1.0f) * f9 : (f9 + f7) - (f7 * f9);
        float f11 = (f9 * 2.0f) - f10;
        return j(t(f11, f10, f6 - 2.0f) * 256.0f) | (j(t(f11, f10, f6 + 2.0f) * 256.0f) << 16) | (j(t(f11, f10, f6) * 256.0f) << 8);
    }

    private static Boolean s0(String str) {
        str.hashCode();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    private static float t(float f2, float f3, float f4) {
        float f5;
        if (f4 < 0.0f) {
            f4 += 6.0f;
        }
        if (f4 >= 6.0f) {
            f4 -= 6.0f;
        }
        if (f4 < 1.0f) {
            f5 = (f3 - f2) * f4;
        } else {
            if (f4 < 3.0f) {
                return f3;
            }
            if (f4 >= 4.0f) {
                return f2;
            }
            f5 = (f3 - f2) * (4.0f - f4);
        }
        return f5 + f2;
    }

    private static SVG.m0 t0(String str) {
        if (!str.startsWith("url(")) {
            return d0(str);
        }
        int indexOf = str.indexOf(")");
        if (indexOf == -1) {
            return new SVG.t(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        return new SVG.t(trim, trim2.length() > 0 ? d0(trim2) : null);
    }

    private void u(Attributes attributes) {
        l("<image>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.n nVar = new SVG.n();
        nVar.a = this.a;
        nVar.b = this.b;
        D(nVar, attributes);
        S(nVar, attributes);
        W(nVar, attributes);
        C(nVar, attributes);
        G(nVar, attributes);
        this.b.g(nVar);
        this.b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x027b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.caverock.androidsvg.SVG.v u0(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.u0(java.lang.String):com.caverock.androidsvg.SVG$v");
    }

    private void v(Attributes attributes) {
        l("<line>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.p pVar = new SVG.p();
        pVar.a = this.a;
        pVar.b = this.b;
        D(pVar, attributes);
        S(pVar, attributes);
        W(pVar, attributes);
        C(pVar, attributes);
        H(pVar, attributes);
        this.b.g(pVar);
    }

    static PreserveAspectRatio v0(String str) {
        PreserveAspectRatio.Scale scale;
        g gVar = new g(str);
        gVar.A();
        String r = gVar.r();
        if ("defer".equals(r)) {
            gVar.A();
            r = gVar.r();
        }
        PreserveAspectRatio.Alignment a2 = b.a(r);
        gVar.A();
        if (gVar.h()) {
            scale = null;
        } else {
            String r2 = gVar.r();
            r2.hashCode();
            if (r2.equals("meet")) {
                scale = PreserveAspectRatio.Scale.meet;
            } else {
                if (!r2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: " + str);
                }
                scale = PreserveAspectRatio.Scale.slice;
            }
        }
        return new PreserveAspectRatio(a2, scale);
    }

    private void w(Attributes attributes) {
        l("<linearGradient>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.k0 k0Var = new SVG.k0();
        k0Var.a = this.a;
        k0Var.b = this.b;
        D(k0Var, attributes);
        S(k0Var, attributes);
        F(k0Var, attributes);
        I(k0Var, attributes);
        this.b.g(k0Var);
        this.b = k0Var;
    }

    private static void w0(SVG.n0 n0Var, String str) {
        n0Var.o = v0(str);
    }

    private void x(Attributes attributes) {
        l("<marker>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.q qVar = new SVG.q();
        qVar.a = this.a;
        qVar.b = this.b;
        D(qVar, attributes);
        S(qVar, attributes);
        C(qVar, attributes);
        Y(qVar, attributes);
        J(qVar, attributes);
        this.b.g(qVar);
        this.b = qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map x0(g gVar) {
        HashMap hashMap = new HashMap();
        gVar.A();
        String s = gVar.s('=');
        while (s != null) {
            gVar.f('=');
            hashMap.put(s, gVar.q());
            gVar.A();
            s = gVar.s('=');
        }
        return hashMap;
    }

    private void y(Attributes attributes) {
        l("<mask>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.r rVar = new SVG.r();
        rVar.a = this.a;
        rVar.b = this.b;
        D(rVar, attributes);
        S(rVar, attributes);
        C(rVar, attributes);
        K(rVar, attributes);
        this.b.g(rVar);
        this.b = rVar;
    }

    private static SVG.Style.RenderQuality y0(String str) {
        str.hashCode();
        switch (str) {
            case "optimizeQuality":
                return SVG.Style.RenderQuality.optimizeQuality;
            case "auto":
                return SVG.Style.RenderQuality.auto;
            case "optimizeSpeed":
                return SVG.Style.RenderQuality.optimizeSpeed;
            default:
                return null;
        }
    }

    private static Set z0(String str) {
        g gVar = new g(str);
        HashSet hashSet = new HashSet();
        while (!gVar.h()) {
            String r = gVar.r();
            if (r.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(r.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            gVar.A();
        }
        return hashSet;
    }

    SVG z(InputStream inputStream, boolean z) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(ProgressEvent.PART_FAILED_EVENT_CODE);
            L0(inputStream, z);
            return this.a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }
}
