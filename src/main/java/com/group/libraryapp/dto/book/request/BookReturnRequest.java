package com.group.libraryapp.dto.book.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BookReturnRequest {
    private final String bookName;
    private final String userName;
}
