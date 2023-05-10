package com.group.libraryapp.dto.book.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public class BookCreateRequest {
    private String name;

    public BookCreateRequest(String name) {
        this.name = name;
    }
}
