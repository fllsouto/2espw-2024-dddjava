# 2espw-2024-dddjava
Material didático utilizado no curso de "Domain-driven-design com Java" para a turma W do curso de Engenharia de Software na FIAP.

## Árvore de Projetos

1. [libuncleotido](libuncletidio/PROBLEM.md)

### Fazendo Fork do projeto

- https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/working-with-forks/fork-a-repo

### Atualizando Fork

```bash
# https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/working-with-forks/syncing-a-fork

git remote add upstream https://github.com/ORIGINAL_OWNER/ORIGINAL_REPOSITORY.git
git fetch upstream
git checkout your-branch
git merge upstream/branch-you-want-to-update-from
git push origin your-branch

```