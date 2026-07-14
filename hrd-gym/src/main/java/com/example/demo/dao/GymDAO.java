package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.MembershipPlanDTO;
import com.example.demo.dto.TrainerDTO;

@Repository
public class GymDAO {

    public List<MembershipPlanDTO> findPlans() {
        return List.of(
            new MembershipPlanDTO("1개월 이용권", "80,000원", "헬스장 자유 이용"),
            new MembershipPlanDTO("3개월 이용권", "210,000원", "장기 이용 할인"),
            new MembershipPlanDTO("PT 10회권", "500,000원", "전문 트레이너 1:1 지도")
        );
    }

    public List<TrainerDTO> findTrainers() {
        return List.of(
            new TrainerDTO("김트레이너", "근력 운동", "기초부터 체계적으로 지도합니다."),
            new TrainerDTO("이코치", "다이어트", "체지방 감량 전문 프로그램을 운영합니다."),
            new TrainerDTO("박강사", "재활 운동", "안전한 운동 자세를 알려드립니다.")
        );
    }
}
