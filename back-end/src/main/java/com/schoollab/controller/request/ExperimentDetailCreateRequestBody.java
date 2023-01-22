package com.schoollab.controller.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ExperimentDetailCreateRequestBody {

    @NotNull(message = "experimentId không được để trống")
    private String experimentId;

    @NotNull(message = "orderNumber không được để trống")
    private Integer orderNumber;

    private Float firstInput;

    private Float secondInput;

    private Float result;
}
