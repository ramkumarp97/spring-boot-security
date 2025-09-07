/**
 * Author: Ramkumar Premkumar
 * User:premram
 * Date:07-09-2025
 * Time:23:09
 */

package com.premram.springbootsecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {

    private String token;
}
