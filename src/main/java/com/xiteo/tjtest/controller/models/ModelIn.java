package com.xiteo.tjtest.controller.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ModelIn {

    @JsonFormat(pattern = "dd-MM-yyyy")
	Date from;
    @JsonFormat(pattern = "dd-MM-yyyy")
	Date to;
}
