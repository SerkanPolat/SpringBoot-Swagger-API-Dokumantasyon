package com.sp;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/kisi")
public class KisiController {

    List<Kisi> kisis = new ArrayList<Kisi>();

    @PostConstruct //Constructor Calistiktan sonra calisacak metod
    public void init(){
        kisis.add(new Kisi(1L,"Test Kisi Adi","Test Soyad", Calendar.getInstance().getTime()));
    }

    @PostMapping
    @ApiOperation(value="Yeni Kisi Ekleme Metodu",notes="Bu Metodu Dikkatli Kullanin Her Cagrimda Ekler.")
    public ResponseEntity<Kisi> KisiEkle(@RequestBody @ApiParam(value="Gelen Kisi") Kisi kisi){
        kisis.add(kisi);
        return ResponseEntity.ok(kisi);
    }
    @GetMapping()
    @ApiOperation(value="Kisi Listeleme Metodu",notes="Get Cagiriminda Tum Kisileri Listeler.")
    public ResponseEntity<List<Kisi>> Listele(){

        return ResponseEntity.ok(kisis);

    }
}
