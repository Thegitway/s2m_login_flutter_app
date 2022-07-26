import 'dart:io';

import 'package:authentication_repository/authentication_repository.dart';
import 'package:flutter/widgets.dart';
import 'package:flutter_login/api/DioService.dart';
import 'package:flutter_login/app.dart';
import 'package:user_repository/user_repository.dart';

void main() {
  HttpOverrides.global = MyHttpOverrides();
  runApp(App(
    dioService: DioService(),
    authenticationRepository: AuthenticationRepository(),
    userRepository: UserRepository(),
  ));
}

class MyHttpOverrides extends HttpOverrides{
  @override

  HttpClient createHttpClient(SecurityContext? context){
    return super.createHttpClient(context)
      ..badCertificateCallback = (X509Certificate cert, String host, int port)=> true;
  }
}
