package com.sp;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Benim Kisi Nesnem",description = "Kisi Nesnesi Aciklamasi")
public class Kisi {

    @ApiModelProperty(value = "Kisinin Essiz Idsi")
    private Long id;
    @ApiModelProperty(value = "Kisi Nesnesinin Ad Alani")
    private String Ad;
    @ApiModelProperty(value = "Kisi Nesnesinin Soyad Alani")
    private String Soyad;
    @ApiModelProperty(value = "Kisi Nesnesinin Tarih Alani")
    private Date date;

}
