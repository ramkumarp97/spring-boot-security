/**
 * Author: Ramkumar Premkumar
 * User:premram
 * Date:07-09-2025
 * Time:14:40
 */

package com.premram.springbootsecurity.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
