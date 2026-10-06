# Linkr

A URL shortener that is deliberately overkill. It's a learning project for hexagonal architecture (ports and adapters)
in Spring Boot, and for Vue with Nuxt on the frontend.

## Project structure

| Directory   | Description                                   |
|-------------|-----------------------------------------------|
| `platform/` | Backend API: Spring Boot, Kotlin, Gradle      |
| `web/`      | Frontend: Nuxt 4, Vue 3, TypeScript, Tailwind |

## Prerequisites

- JDK 26
- Node.js 24
- pnpm (run `corepack enable` to use the version pinned in `web/package.json`)
- Docker (optional, for running everything together)

## Running locally

### Platform

```sh
cd platform
./gradlew bootRun
```

The API runs on http://localhost:8080.

Other useful commands:

```sh
./gradlew testUnit         # unit tests
./gradlew testIntegration  # integration tests
./gradlew ktlintCheck      # lint
```

### Web

```sh
cd web
pnpm install
pnpm dev
```

The app runs on http://localhost:3000.

Other useful commands:

```sh
pnpm lint          # ESLint
pnpm format        # Prettier
pnpm typecheck     # vue-tsc
pnpm build         # production build
```

## Running with Docker Compose

From the repository root:

```sh
docker compose up --build
```

This builds and starts both services:

- Web: http://localhost:3000
- Platform: http://localhost:8080

To stop everything:

```sh
docker compose down
```
