package com.ppdai.platform.das.console.dto.model.saec;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DasDBInstance {
    private InfoSaec secInfoDto;
    private DataInst data;
}
