package com.uad2.application.matching.resource;
/*
 * @USER JungHyun
 * @DATE 2019-09-12
 * @DESCRIPTION api 반환용 회원 HAL 포멧
 */

import com.uad2.application.attendance.dto.AttendanceDto;
import com.uad2.application.matching.dto.MatchingDto;
import org.springframework.hateoas.ResourceSupport;

public class MatchingExternalResource extends ResourceSupport {//.add로 링크추가 가능
    private MatchingDto.Response response;

    private MatchingExternalResource(MatchingDto.Response response) {
        this.response = response;
    }

    /**
     * 인스턴스 생성을 위한 정적 팩토리 메서드
     *
     * @param response 회원 Response 커맨드 객체
     * @return MemberExternalResource 인스턴스를 반환한다.
     */
    public static MatchingExternalResource createResourceFrom(MatchingDto.Response response) {
        return new MatchingExternalResource(response);
    }

    public MatchingDto.Response getAttendance() {
        return response;
    }//return되는 필드명
}
