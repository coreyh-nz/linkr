FROM node:26-alpine AS build
WORKDIR /app

RUN corepack enable

COPY package.json pnpm-lock.yaml pnpm-workspace.yaml ./
RUN --mount=type=cache,target=/pnpm-store \
    pnpm install --frozen-lockfile --store-dir /pnpm-store

COPY . ./
RUN pnpm run build

FROM node:26-alpine
WORKDIR /app

COPY --from=build /app/.output/ ./

ENV NODE_ENV=production \
    HOST=0.0.0.0 \
    PORT=3000

USER node
EXPOSE 3000

CMD ["node", "/app/server/index.mjs"]