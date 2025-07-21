package com.nytimes.android.features.games.gameshub.progress.api;

import defpackage.by0;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* loaded from: classes4.dex */
public interface GamesProgressApi {
    @GET("progress.json")
    Object getNytGameData(@Query("crossword_daily") int i, @Query("crossword_mini") int i2, @Query("spelling_bee") List<Integer> list, @Query("wordle") int i3, by0<? super GamesProgressResponse> by0Var);

    @GET("active.json")
    Object getPuzzleId(@Query("date") String str, by0<? super PuzzleIdResponse> by0Var);
}
