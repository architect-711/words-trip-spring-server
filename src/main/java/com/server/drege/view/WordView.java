package com.server.drege.view;

import com.server.drege.entity.Response;

import java.util.List;
import java.util.Optional;

public class WordView {

    public static <T> Response<T> getDataRepresentation(Optional<T> data) {
        return data.map(t -> new Response<>(t, 200)).orElseGet(() -> new Response<>(null, 404));
    }

    public static <T> Response<List<T>> getDataRepresentationOfList(List<T> data) {
        return !data.isEmpty() ? new Response<>(data, 200) : new Response<>(null, 404);
    }
}
