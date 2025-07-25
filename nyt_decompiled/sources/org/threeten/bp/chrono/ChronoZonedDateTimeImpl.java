package org.threeten.bp.chrono;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.ChronoLocalDate;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.Temporal;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalAdjuster;
import org.threeten.bp.temporal.TemporalField;
import org.threeten.bp.temporal.TemporalUnit;
import org.threeten.bp.zone.ZoneOffsetTransition;
import org.threeten.bp.zone.ZoneRules;

/* loaded from: classes5.dex */
final class ChronoZonedDateTimeImpl<D extends ChronoLocalDate> extends ChronoZonedDateTime<D> implements Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    private final ChronoLocalDateTimeImpl<D> dateTime;
    private final ZoneOffset offset;
    private final ZoneId zone;

    /* renamed from: org.threeten.bp.chrono.ChronoZonedDateTimeImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoField;

        static {
            int[] iArr = new int[ChronoField.values().length];
            $SwitchMap$org$threeten$bp$temporal$ChronoField = iArr;
            try {
                iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoField[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private ChronoZonedDateTimeImpl(ChronoLocalDateTimeImpl<D> chronoLocalDateTimeImpl, ZoneOffset zoneOffset, ZoneId zoneId) {
        this.dateTime = (ChronoLocalDateTimeImpl) Jdk8Methods.requireNonNull(chronoLocalDateTimeImpl, "dateTime");
        this.offset = (ZoneOffset) Jdk8Methods.requireNonNull(zoneOffset, "offset");
        this.zone = (ZoneId) Jdk8Methods.requireNonNull(zoneId, "zone");
    }

    private ChronoZonedDateTimeImpl<D> create(Instant instant, ZoneId zoneId) {
        return ofInstant(toLocalDate().getChronology(), instant, zoneId);
    }

    static <R extends ChronoLocalDate> ChronoZonedDateTime<R> ofBest(ChronoLocalDateTimeImpl<R> chronoLocalDateTimeImpl, ZoneId zoneId, ZoneOffset zoneOffset) {
        Jdk8Methods.requireNonNull(chronoLocalDateTimeImpl, "localDateTime");
        Jdk8Methods.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ChronoZonedDateTimeImpl(chronoLocalDateTimeImpl, (ZoneOffset) zoneId, zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime from = LocalDateTime.from((TemporalAccessor) chronoLocalDateTimeImpl);
        List<ZoneOffset> validOffsets = rules.getValidOffsets(from);
        if (validOffsets.size() == 1) {
            zoneOffset = validOffsets.get(0);
        } else if (validOffsets.size() == 0) {
            ZoneOffsetTransition transition = rules.getTransition(from);
            chronoLocalDateTimeImpl = chronoLocalDateTimeImpl.plusSeconds(transition.getDuration().getSeconds());
            zoneOffset = transition.getOffsetAfter();
        } else if (zoneOffset == null || !validOffsets.contains(zoneOffset)) {
            zoneOffset = validOffsets.get(0);
        }
        Jdk8Methods.requireNonNull(zoneOffset, "offset");
        return new ChronoZonedDateTimeImpl(chronoLocalDateTimeImpl, zoneOffset, zoneId);
    }

    static <R extends ChronoLocalDate> ChronoZonedDateTimeImpl<R> ofInstant(Chronology chronology, Instant instant, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        Jdk8Methods.requireNonNull(offset, "offset");
        return new ChronoZonedDateTimeImpl<>((ChronoLocalDateTimeImpl) chronology.localDateTime(LocalDateTime.ofEpochSecond(instant.getEpochSecond(), instant.getNano(), offset)), offset, zoneId);
    }

    static ChronoZonedDateTime<?> readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) objectInput.readObject();
        ZoneOffset zoneOffset = (ZoneOffset) objectInput.readObject();
        return chronoLocalDateTime.atZone2(zoneOffset).withZoneSameLocal2((ZoneId) objectInput.readObject());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 13, this);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && compareTo((ChronoZonedDateTime<?>) obj) == 0;
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    public ZoneOffset getOffset() {
        return this.offset;
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    public ZoneId getZone() {
        return this.zone;
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    public int hashCode() {
        return Integer.rotateLeft(getZone().hashCode(), 3) ^ (toLocalDateTime2().hashCode() ^ getOffset().hashCode());
    }

    @Override // org.threeten.bp.temporal.Temporal
    public boolean isSupported(TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? temporalUnit.isDateBased() || temporalUnit.isTimeBased() : temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    /* renamed from: toLocalDateTime */
    public ChronoLocalDateTime<D> toLocalDateTime2() {
        return this.dateTime;
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    public String toString() {
        String str = toLocalDateTime2().toString() + getOffset().toString();
        if (getOffset() == getZone()) {
            return str;
        }
        return str + '[' + getZone().toString() + ']';
    }

    @Override // org.threeten.bp.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        ChronoZonedDateTime<?> zonedDateTime = toLocalDate().getChronology().zonedDateTime(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, zonedDateTime);
        }
        return this.dateTime.until(zonedDateTime.withZoneSameInstant2(this.offset).toLocalDateTime2(), temporalUnit);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    /* renamed from: withEarlierOffsetAtOverlap */
    public ChronoZonedDateTime<D> withEarlierOffsetAtOverlap2() {
        ZoneOffsetTransition transition = getZone().getRules().getTransition(LocalDateTime.from((TemporalAccessor) this));
        if (transition != null && transition.isOverlap()) {
            ZoneOffset offsetBefore = transition.getOffsetBefore();
            if (!offsetBefore.equals(this.offset)) {
                return new ChronoZonedDateTimeImpl(this.dateTime, offsetBefore, this.zone);
            }
        }
        return this;
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    /* renamed from: withLaterOffsetAtOverlap */
    public ChronoZonedDateTime<D> withLaterOffsetAtOverlap2() {
        ZoneOffsetTransition transition = getZone().getRules().getTransition(LocalDateTime.from((TemporalAccessor) this));
        if (transition != null) {
            ZoneOffset offsetAfter = transition.getOffsetAfter();
            if (!offsetAfter.equals(getOffset())) {
                return new ChronoZonedDateTimeImpl(this.dateTime, offsetAfter, this.zone);
            }
        }
        return this;
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    /* renamed from: withZoneSameInstant */
    public ChronoZonedDateTime<D> withZoneSameInstant2(ZoneId zoneId) {
        Jdk8Methods.requireNonNull(zoneId, "zone");
        return this.zone.equals(zoneId) ? this : create(this.dateTime.toInstant(this.offset), zoneId);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    /* renamed from: withZoneSameLocal */
    public ChronoZonedDateTime<D> withZoneSameLocal2(ZoneId zoneId) {
        return ofBest(this.dateTime, zoneId, this.offset);
    }

    void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.dateTime);
        objectOutput.writeObject(this.offset);
        objectOutput.writeObject(this.zone);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime, org.threeten.bp.temporal.Temporal
    public ChronoZonedDateTime<D> plus(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? with((TemporalAdjuster) this.dateTime.plus(j, temporalUnit)) : toLocalDate().getChronology().ensureChronoZonedDateTime(temporalUnit.addTo(this, j));
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime, org.threeten.bp.temporal.Temporal
    public ChronoZonedDateTime<D> with(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return toLocalDate().getChronology().ensureChronoZonedDateTime(temporalField.adjustInto(this, j));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = AnonymousClass1.$SwitchMap$org$threeten$bp$temporal$ChronoField[chronoField.ordinal()];
        if (i == 1) {
            return plus(j - toEpochSecond(), (TemporalUnit) ChronoUnit.SECONDS);
        }
        if (i != 2) {
            return ofBest(this.dateTime.with(temporalField, j), this.zone, this.offset);
        }
        return create(this.dateTime.toInstant(ZoneOffset.ofTotalSeconds(chronoField.checkValidIntValue(j))), this.zone);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        return (temporalField instanceof ChronoField) || (temporalField != null && temporalField.isSupportedBy(this));
    }
}
