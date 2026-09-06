package com.nency.collegemanagementsystem.service;

import com.nency.collegemanagementsystem.dto.ChangePasswordDTO;
import com.nency.collegemanagementsystem.dto.ForgotPasswordDTO;
import com.nency.collegemanagementsystem.dto.ResetPasswordDTO;
import com.nency.collegemanagementsystem.dto.UpdateStudentDTO;
import com.nency.collegemanagementsystem.dto.request.*;
import com.nency.collegemanagementsystem.dto.response.ApiResponse;

public interface AuthService {

    ApiResponse registerStudent(StudentRegisterDTO request);
    ApiResponse registerFaculty(FacultyRegisterDTO request);
    ApiResponse registerAdmin(AdminRegisterDTO request);
    ApiResponse loginStudent(LoginDTO request);
    ApiResponse loginFaculty(LoginDTO request);
    ApiResponse loginAdmin(LoginDTO request);
    ApiResponse forgotPassword(ForgotPasswordDTO request);
    ApiResponse resetPassword(ResetPasswordDTO request);
    ApiResponse changePassword(ChangePasswordDTO request);
    ApiResponse getStudentProfile();
    ApiResponse updateStudentProfile(UpdateStudentDTO request);

}