package com.mino.springlab.lecture7;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public
class Picture {
    private String name;
    private String type;
    private String source;
    private long size;

}
