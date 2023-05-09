package com.group.libraryapp.dto.user.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class UserUpdateRequest {
    private final Long id;
    private final String name;

}
