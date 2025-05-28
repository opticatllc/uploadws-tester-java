$destDir = "dist"

if (-not (Test-Path -Path $destDir)) {
    New-Item -ItemType Directory -Path $destDir | Out-Null
}

$jarFile = Get-ChildItem -Path "target" -Filter "*jar-with-dependencies.jar" -Recurse | Select-Object -First 1

if (-not $jarFile) {
    Write-Host "*-jar-with-dependencies.jar not existing in target/" -ForegroundColor Red
    exit 1
}

Copy-Item -Path $jarFile.FullName -Destination $destDir
Write-Host "*-jar-with-dependencies.jar successfully exported to $destDir/: $($jarFile.Name)" -ForegroundColor Green
