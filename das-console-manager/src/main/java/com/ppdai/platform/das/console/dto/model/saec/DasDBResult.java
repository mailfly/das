package com.ppdai.platform.das.console.dto.model.saec;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DasDBResult {
    private String responseCode;
    private String responseMessage;
    private DasDBContent responseContent;
}
