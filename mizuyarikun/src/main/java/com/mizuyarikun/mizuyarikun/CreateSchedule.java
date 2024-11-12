package com.mizuyarikun.mizuyarikun;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.mizuyarikun.mizuyarikun.entity.PlantPlace;
import com.mizuyarikun.mizuyarikun.service.PlantScheduleDto;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateSchedule {

    // 1.最後に水やりを行った日付を最終潅水日に設定する(屋外の場合は水やり日と雨の日のうち、新しい日を設定する)
    // 2.(1)最終潅水日から本日までに水やり頻度以上の日数が経過している場合、次の水やり予定を本日にする。
    //   (2)(1)以外の場合、次の水やり予定は(最終潅水日+水やり頻度)で求める。
    // 3.一週間分の水やり予定を求める。

    //PlantPlace plantPlace = new PlantPlace();

    private byte[] id;
    private String name;
    private int frequency;
    private int placeId;
    private String placeName;
    private String description;
    private LocalDateTime watering_date;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;



    public static void manageCreateSchedule(){

        

        PlantScheduleDto.checkLastWatering(PlantPlace.Watering_date); //ここ
    }

    
    public static LocalDate checkLastWatering(LocalDate watering_date) {
           

        
        return null;

    }
}
