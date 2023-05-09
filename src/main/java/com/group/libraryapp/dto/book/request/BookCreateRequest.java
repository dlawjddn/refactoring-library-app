package com.group.libraryapp.dto.book.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BookCreateRequest {
    private final String name;
}
