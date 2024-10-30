# test-reports

Shows test reports failing to build under Scala Cross Version compilation vs having a single root module

Comment / Uncomment `object foo` vs `object 'package'`

## Cross Version Module Module

- Uncomment `val scalaVersions` and `object foo`
- Comment out `object 'package'`

Run `./mill __.test`, which will run tests for all 3 versions: (2.13.15, 2.12.20, 3.5.2)

There will be no `out/foo/$version/test/test.dest/test-report.xml` for any of the versions. Other test output files will exist.

## Root Module

- Uncomment `object 'package'`
- Comment out `val scalaVersions` and `object foo`

Run `./mill test` which will run the tests as a single root module using scala 3.5.2.

There will be an output file `out/test/test.dest/test-report.xml` with the test reports
