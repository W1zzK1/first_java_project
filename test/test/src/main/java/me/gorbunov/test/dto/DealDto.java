package me.gorbunov.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.gorbunov.test.domain.DealType;
import me.gorbunov.test.domain.Status;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DealDto {
    private Long id;
    private String title;
    private DealType dealType;
    private Status status;
}
