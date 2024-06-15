LuciLul
lucilul
Unsichtbar

LuciLul — 14.12.2023 11:53
Wagner is here
LuciLul — 05.01.2024 20:01
Bild
Bild
Julian be like:
Today I choose Moodswings
FlameingRodYT — 05.01.2024 20:03
HHahhaha, moat functuonal 4ehif team
Funily enough we finiahed our trailer and prototype oddly enough
LuciLul — 05.01.2024 22:11
Sick
FlameingRodYT — 28.02.2024 17:02
common Java Maven L
Bild
Expecting 2 objects to be the same, HOW DARE YOU
LuciLul — 28.02.2024 17:42
Me when java does let me write code breaking statements
FlameingRodYT — 28.02.2024 17:45
btw forgot to tell you, we talked to Zumpf about next year and he for sure said he wont support our 2 team endavour.So if you ahvent find any other team we will accept you
LuciLul — 28.02.2024 17:48
Look im gonna be honest 
You were my only option
These are the teams
Bild
I refuse to get in a team with Ben and Leander
And the Maxim group would be super exhausting
FlameingRodYT — 28.02.2024 18:03
Okay as i said me and jonke talked and we think, especially me, that 3 would be bwtter
LuciLul — 01.03.2024 12:40
Habibi
Komm to Kantine they have Cevapcici
FlameingRodYT — 01.03.2024 12:42
Fake Cevapcici
LuciLul — 01.03.2024 12:42
Jesus Christ
Kofler is also here
FlameingRodYT — 01.03.2024 12:43
hell nah
Kofler is devil
LuciLul — 07.03.2024 10:18
https://geotastic.net/join/0WYqsUteQE
Geotastic - the free crowdfunded multiplayer geo quiz app
Geotastic is a free to play multiplayer focused geo quiz app that can be played with friends simultaneously. A free alternative to geoguessr.
FlameingRodYT — 07.03.2024 16:46
bro our class has such shitposters
Bild
LuciLul — 07.03.2024 16:47
Womp womp
F for the students who have lost their sanity
LuciLul — 10.03.2024 12:25
Do you have task 6 for the physics homework?
Does he expect a calculation or just text answers?
FlameingRodYT — 10.03.2024 12:27
I wrote just a text
so no need to for calculations
I mean you can do it mathematically but why bother
idk how you did your calculations, but the prior tasks might come of help
LuciLul — 10.03.2024 12:29
Aight thanks
To express my gratitude i will gift a meme
Bild
FlameingRodYT — 10.03.2024 12:29
W meme
FlameingRodYT — 10.03.2024 12:59
yo lucca
do you ahve the Work sheet from maths where we had to do DGl mit Trennen der Variablen, we had once homework from that?
LuciLul — 10.03.2024 13:03
Bild
Yes
FlameingRodYT — 10.03.2024 13:25
tnx
FlameingRodYT — heute um 09:05 Uhr
Dateityp des Anhangs: unknown
mvnw
11.33 KB
real
@REM ----------------------------------------------------------------------------

@REM Licensed to the Apache Software Foundation (ASF) under one

@REM or more contributor license agreements.  See the NOTICE file

@REM distributed with this work for additional information

@REM regarding copyright ownership.  The ASF licenses this file

@REM to you under the Apache License, Version 2.0 (the

@REM "License"); you may not use this file except in compliance

@REM with the License.  You may obtain a copy of the License at

@REM

@REM    https://www.apache.org/licenses/LICENSE-2.0

@REM

@REM Unless required by applicable law or agreed to in writing,

@REM software distributed under the License is distributed on an

@REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY

@REM KIND, either express or implied.  See the License for the

@REM specific language governing permissions and limitations

@REM under the License.

@REM ----------------------------------------------------------------------------


@REM ----------------------------------------------------------------------------

@REM Apache Maven Wrapper startup batch script, version 3.2.0

@REM

@REM Required ENV vars:

@REM JAVA_HOME - location of a JDK home dir

@REM

@REM Optional ENV vars

@REM MAVEN_BATCH_ECHO - set to 'on' to enable the echoing of the batch commands

@REM MAVEN_BATCH_PAUSE - set to 'on' to wait for a keystroke before ending

@REM MAVEN_OPTS - parameters passed to the Java VM when running Maven

@REM     e.g. to debug Maven itself, use

@REM set MAVEN_OPTS=-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=8000

@REM MAVEN_SKIP_RC - flag to disable loading of mavenrc files

@REM ----------------------------------------------------------------------------


@REM Begin all REM lines with '@' in case MAVEN_BATCH_ECHO is 'on'
@echo off

@REM set title of command window
title %0

@REM enable echoing by setting MAVEN_BATCH_ECHO to 'on'
@if "%MAVEN_BATCH_ECHO%" == "on"  echo %MAVEN_BATCH_ECHO%


@REM set %HOME% to equivalent of $HOME
if "%HOME%" == "" (set "HOME=%HOMEDRIVE%%HOMEPATH%")


@REM Execute a users defined script before this one
if not "%MAVEN_SKIP_RC%" == "" goto skipRcPre

@REM check for pre script, once with legacy .bat ending and once with .cmd ending
if exist "%USERPROFILE%\mavenrc_pre.bat" call "%USERPROFILE%\mavenrc_pre.bat" %*
if exist "%USERPROFILE%\mavenrc_pre.cmd" call "%USERPROFILE%\mavenrc_pre.cmd" %*
:skipRcPre

@setlocal

set ERROR_CODE=0


@REM To isolate internal variables from possible post scripts, we use another setlocal
@setlocal


@REM ==== START VALIDATION ====
if not "%JAVA_HOME%" == "" goto OkJHome

echo.
echo Error: JAVA_HOME not found in your environment. >&2
echo Please set the JAVA_HOME variable in your environment to match the >&2
echo location of your Java installation. >&2
echo.
goto error

:OkJHome
if exist "%JAVA_HOME%\bin\java.exe" goto init

echo.
echo Error: JAVA_HOME is set to an invalid directory. >&2
echo JAVA_HOME = "%JAVA_HOME%" >&2
echo Please set the JAVA_HOME variable in your environment to match the >&2
echo location of your Java installation. >&2
echo.
goto error


@REM ==== END VALIDATION ====

:init


@REM Find the project base dir, i.e. the directory that contains the folder ".mvn".

@REM Fallback to current working directory if not found.

set MAVEN_PROJECTBASEDIR=%MAVEN_BASEDIR%
IF NOT "%MAVEN_PROJECTBASEDIR%"=="" goto endDetectBaseDir

set EXEC_DIR=%CD%
set WDIR=%EXEC_DIR%
:findBaseDir
IF EXIST "%WDIR%"\.mvn goto baseDirFound
cd ..
IF "%WDIR%"=="%CD%" goto baseDirNotFound
set WDIR=%CD%
goto findBaseDir

:baseDirFound
set MAVEN_PROJECTBASEDIR=%WDIR%
... (106 Zeilen verbleibend)
Einklappen
mvnw.cmd
8 kB
also real
﻿
FlameingRodYT
flameingrodyt
Star wars is cool, games are cool and history is cool :D
@REM ----------------------------------------------------------------------------

@REM Licensed to the Apache Software Foundation (ASF) under one

@REM or more contributor license agreements.  See the NOTICE file

@REM distributed with this work for additional information

@REM regarding copyright ownership.  The ASF licenses this file

@REM to you under the Apache License, Version 2.0 (the

@REM "License"); you may not use this file except in compliance

@REM with the License.  You may obtain a copy of the License at

@REM

@REM    https://www.apache.org/licenses/LICENSE-2.0

@REM

@REM Unless required by applicable law or agreed to in writing,

@REM software distributed under the License is distributed on an

@REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY

@REM KIND, either express or implied.  See the License for the

@REM specific language governing permissions and limitations

@REM under the License.

@REM ----------------------------------------------------------------------------


@REM ----------------------------------------------------------------------------

@REM Apache Maven Wrapper startup batch script, version 3.2.0

@REM

@REM Required ENV vars:

@REM JAVA_HOME - location of a JDK home dir

@REM

@REM Optional ENV vars

@REM MAVEN_BATCH_ECHO - set to 'on' to enable the echoing of the batch commands

@REM MAVEN_BATCH_PAUSE - set to 'on' to wait for a keystroke before ending

@REM MAVEN_OPTS - parameters passed to the Java VM when running Maven

@REM     e.g. to debug Maven itself, use

@REM set MAVEN_OPTS=-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=8000

@REM MAVEN_SKIP_RC - flag to disable loading of mavenrc files

@REM ----------------------------------------------------------------------------


@REM Begin all REM lines with '@' in case MAVEN_BATCH_ECHO is 'on'
@echo off

@REM set title of command window
title %0

@REM enable echoing by setting MAVEN_BATCH_ECHO to 'on'
@if "%MAVEN_BATCH_ECHO%" == "on"  echo %MAVEN_BATCH_ECHO%


@REM set %HOME% to equivalent of $HOME
if "%HOME%" == "" (set "HOME=%HOMEDRIVE%%HOMEPATH%")


@REM Execute a users defined script before this one
if not "%MAVEN_SKIP_RC%" == "" goto skipRcPre

@REM check for pre script, once with legacy .bat ending and once with .cmd ending
if exist "%USERPROFILE%\mavenrc_pre.bat" call "%USERPROFILE%\mavenrc_pre.bat" %*
if exist "%USERPROFILE%\mavenrc_pre.cmd" call "%USERPROFILE%\mavenrc_pre.cmd" %*
:skipRcPre

@setlocal

set ERROR_CODE=0


@REM To isolate internal variables from possible post scripts, we use another setlocal
@setlocal


@REM ==== START VALIDATION ====
if not "%JAVA_HOME%" == "" goto OkJHome

echo.
echo Error: JAVA_HOME not found in your environment. >&2
echo Please set the JAVA_HOME variable in your environment to match the >&2
echo location of your Java installation. >&2
echo.
goto error

:OkJHome
if exist "%JAVA_HOME%\bin\java.exe" goto init

echo.
echo Error: JAVA_HOME is set to an invalid directory. >&2
echo JAVA_HOME = "%JAVA_HOME%" >&2
echo Please set the JAVA_HOME variable in your environment to match the >&2
echo location of your Java installation. >&2
echo.
goto error


@REM ==== END VALIDATION ====

:init


@REM Find the project base dir, i.e. the directory that contains the folder ".mvn".

@REM Fallback to current working directory if not found.

set MAVEN_PROJECTBASEDIR=%MAVEN_BASEDIR%
IF NOT "%MAVEN_PROJECTBASEDIR%"=="" goto endDetectBaseDir

set EXEC_DIR=%CD%
set WDIR=%EXEC_DIR%
:findBaseDir
IF EXIST "%WDIR%"\.mvn goto baseDirFound
cd ..
IF "%WDIR%"=="%CD%" goto baseDirNotFound
set WDIR=%CD%
goto findBaseDir

:baseDirFound
set MAVEN_PROJECTBASEDIR=%WDIR%
cd "%EXEC_DIR%"
goto endDetectBaseDir

:baseDirNotFound
set MAVEN_PROJECTBASEDIR=%EXEC_DIR%
cd "%EXEC_DIR%"

:endDetectBaseDir

IF NOT EXIST "%MAVEN_PROJECTBASEDIR%\.mvn\jvm.config" goto endReadAdditionalConfig

@setlocal EnableExtensions EnableDelayedExpansion
for /F "usebackq delims=" %%a in ("%MAVEN_PROJECTBASEDIR%\.mvn\jvm.config") do set JVM_CONFIG_MAVEN_PROPS=!JVM_CONFIG_MAVEN_PROPS! %%a
@endlocal & set JVM_CONFIG_MAVEN_PROPS=%JVM_CONFIG_MAVEN_PROPS%

:endReadAdditionalConfig

SET MAVEN_JAVA_EXE="%JAVA_HOME%\bin\java.exe"
set WRAPPER_JAR="%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\maven-wrapper.jar"
set WRAPPER_LAUNCHER=org.apache.maven.wrapper.MavenWrapperMain

set WRAPPER_URL="https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.2.0/maven-wrapper-3.2.0.jar"

FOR /F "usebackq tokens=1,2 delims==" %%A IN ("%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\maven-wrapper.properties") DO (
    IF "%%A"=="wrapperUrl" SET WRAPPER_URL=%%B
)


@REM Extension to allow automatically downloading the maven-wrapper.jar from Maven-central

@REM This allows using the maven wrapper in projects that prohibit checking in binary data.
if exist %WRAPPER_JAR% (
    if "%MVNW_VERBOSE%" == "true" (
        echo Found %WRAPPER_JAR%
    )
) else (
    if not "%MVNW_REPOURL%" == "" (
        SET WRAPPER_URL="%MVNW_REPOURL%/org/apache/maven/wrapper/maven-wrapper/3.2.0/maven-wrapper-3.2.0.jar"
    )
    if "%MVNW_VERBOSE%" == "true" (
        echo Couldn't find %WRAPPER_JAR%, downloading it ...
        echo Downloading from: %WRAPPER_URL%
    )

    powershell -Command "&{"^
		"$webclient = new-object System.Net.WebClient;"^
		"if (-not ([string]::IsNullOrEmpty('%MVNW_USERNAME%') -and [string]::IsNullOrEmpty('%MVNW_PASSWORD%'))) {"^
		"$webclient.Credentials = new-object System.Net.NetworkCredential('%MVNW_USERNAME%', '%MVNW_PASSWORD%');"^
		"}"^
		"[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12; $webclient.DownloadFile('%WRAPPER_URL%', '%WRAPPER_JAR%')"^
		"}"
    if "%MVNW_VERBOSE%" == "true" (
        echo Finished downloading %WRAPPER_JAR%
    )
)

@REM End of extension


@REM If specified, validate the SHA-256 sum of the Maven wrapper jar file
SET WRAPPER_SHA_256_SUM=""
FOR /F "usebackq tokens=1,2 delims==" %%A IN ("%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\maven-wrapper.properties") DO (
    IF "%%A"=="wrapperSha256Sum" SET WRAPPER_SHA_256_SUM=%%B
)
IF NOT %WRAPPER_SHA_256_SUM%=="" (
    powershell -Command "&{"^
       "$hash = (Get-FileHash \"%WRAPPER_JAR%\" -Algorithm SHA256).Hash.ToLower();"^
       "If('%WRAPPER_SHA_256_SUM%' -ne $hash){"^
       "  Write-Output 'Error: Failed to validate Maven wrapper SHA-256, your Maven wrapper might be compromised.';"^
       "  Write-Output 'Investigate or delete %WRAPPER_JAR% to attempt a clean download.';"^
       "  Write-Output 'If you updated your Maven version, you need to update the specified wrapperSha256Sum property.';"^
       "  exit 1;"^
       "}"^
       "}"
    if ERRORLEVEL 1 goto error
)


@REM Provide a "standardized" way to retrieve the CLI args that will

@REM work with both Windows and non-Windows executions.
set MAVEN_CMD_LINE_ARGS=%*

%MAVEN_JAVA_EXE% ^
  %JVM_CONFIG_MAVEN_PROPS% ^
  %MAVEN_OPTS% ^
  %MAVEN_DEBUG_OPTS% ^
  -classpath %WRAPPER_JAR% ^
  "-Dmaven.multiModuleProjectDirectory=%MAVEN_PROJECTBASEDIR%" ^
  %WRAPPER_LAUNCHER% %MAVEN_CONFIG% %*
if ERRORLEVEL 1 goto error
goto end

:error
set ERROR_CODE=1

:end
@endlocal & set ERROR_CODE=%ERROR_CODE%

if not "%MAVEN_SKIP_RC%"=="" goto skipRcPost

@REM check for post script, once with legacy .bat ending and once with .cmd ending
if exist "%USERPROFILE%\mavenrc_post.bat" call "%USERPROFILE%\mavenrc_post.bat"
if exist "%USERPROFILE%\mavenrc_post.cmd" call "%USERPROFILE%\mavenrc_post.cmd"
:skipRcPost


@REM pause the script if MAVEN_BATCH_PAUSE is set to 'on'
if "%MAVEN_BATCH_PAUSE%"=="on" pause

if "%MAVEN_TERMINATE_CMD%"=="on" exit %ERROR_CODE%

cmd /C exit /B %ERROR_CODE%
mvnw.cmd
8 kB